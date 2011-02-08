package org.netmelody.cii.witness.teamcity;

import java.util.ArrayList;

import org.netmelody.cii.domain.Feature;
import org.netmelody.cii.domain.Target;
import org.netmelody.cii.domain.TargetGroup;
import org.netmelody.cii.witness.Witness;

public final class TeamCityWitness implements Witness {

    @Override
    public TargetGroup statusOf(Feature feature) {
        return new TargetGroup(new ArrayList<Target>());
    }

}
