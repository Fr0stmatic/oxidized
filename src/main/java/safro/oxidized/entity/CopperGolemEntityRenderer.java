package safro.oxidized.entity;

import net.minecraft.block.Oxidizable;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import safro.oxidized.OxidizedClient;

public class CopperGolemEntityRenderer extends MobEntityRenderer<CopperGolemEntity, CopperGolemEntityModel> {
    private static final Identifier UNAFFECTED = new Identifier("oxidized", "textures/entity/copper_golem.png");
    private static final Identifier EXPOSED = new Identifier("oxidized", "textures/entity/exposed_copper_golem.png");
    private static final Identifier WEATHERED = new Identifier("oxidized", "textures/entity/weathered_copper_golem.png");
    private static final Identifier OXIDIZED = new Identifier("oxidized", "textures/entity/oxidized_copper_golem.png");

    public CopperGolemEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CopperGolemEntityModel(context.getPart(OxidizedClient.COPPER_GOLEM_LAYER)), 0.2F);
    }

    public Identifier getTexture(CopperGolemEntity entity) {
        if (entity.getOxidizationLevel() == Oxidizable.OxidizationLevel.EXPOSED) {
            return EXPOSED;
        } else if (entity.getOxidizationLevel() == Oxidizable.OxidizationLevel.WEATHERED) {
            return WEATHERED;
        } else if (entity.getOxidizationLevel() == Oxidizable.OxidizationLevel.OXIDIZED) {
            return OXIDIZED;
        } else
            return UNAFFECTED;
    }
}
