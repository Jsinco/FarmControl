package com.froobworld.farmcontrol.controller.action;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;

public class KillAction extends Action {

    public KillAction() {
        super("kill", true, false, false);
    }

    @Override
    public void doAction(Entity entity) {
        if (!(entity instanceof Mob ent)) {
            return;
        }

        ent.setHealth(0);
    }

    @Override
    public void undoAction(Mob mob) {}
}
