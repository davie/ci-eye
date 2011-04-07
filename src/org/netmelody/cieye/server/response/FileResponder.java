package org.netmelody.cieye.server.response;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ResourceBundle;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.simpleframework.http.Response;

public final class FileResponder implements CiEyeResponder {

    private static final Log LOG = LogFactory.getLog(FileResponder.class);
    private static final ResourceBundle MIME_TYPES = ResourceBundle.getBundle(FileResponder.class.getName());
    
    private final String name;
    private final String extension;

    public FileResponder(String name) {
        this.name = name;
        this.extension = name.substring(name.lastIndexOf('.') + 1);
        LOG.info(name);
    }

    @Override
    public void writeTo(Response response) throws IOException {
        InputStream input = null;
        OutputStream body = null;
        try {
            input = getClass().getResourceAsStream("/" + name);
            body = response.getOutputStream();
            response.set("Content-Type", MIME_TYPES.getString(extension));
            IOUtils.copy(input, body);
        }
        finally {
            IOUtils.closeQuietly(input);
            IOUtils.closeQuietly(body);
        }
    }
}

