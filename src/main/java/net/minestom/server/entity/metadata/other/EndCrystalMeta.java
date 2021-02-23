package net.minestom.server.entity.metadata.other;

import net.minestom.server.entity.Entity;
import net.minestom.server.entity.Metadata;
import net.minestom.server.entity.metadata.BaseEntityMeta;
import net.minestom.server.utils.BlockPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EndCrystalMeta extends BaseEntityMeta {

    public EndCrystalMeta(@NotNull Entity entity) {
        super(entity);
    }

    @Nullable
    public BlockPosition getBeamTarget() {
        return getMetadata().getIndex((byte) 7, null);
    }

    public void setBeamTarget(@Nullable BlockPosition value) {
        getMetadata().setIndex((byte) 7, Metadata.OptPosition(value));
    }

    public boolean isShowingBottom() {
        return getMetadata().getIndex((byte) 8, true);
    }

    public void setShowingBottom(boolean value) {
        getMetadata().setIndex((byte) 8, Metadata.Boolean(value));
    }

}
