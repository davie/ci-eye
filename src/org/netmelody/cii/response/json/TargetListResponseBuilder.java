package org.netmelody.cii.response.json;

import org.netmelody.cii.domain.Feature;
import org.netmelody.cii.response.JsonResponse;
import org.netmelody.cii.response.JsonResponseBuilder;
import org.netmelody.cii.witness.Witness;
import org.simpleframework.http.Query;

public final class TargetListResponseBuilder implements JsonResponseBuilder {

    private final Witness witness;

    public TargetListResponseBuilder(Witness witness) {
        this.witness = witness;
    }
    
    @Override
    public JsonResponse buildResponse(Query query, String requestContent) {
        return new JsonResponse(witness.statusOf(new Feature("HIP Hawk", "http://ccmain:8080")));
    }
}
