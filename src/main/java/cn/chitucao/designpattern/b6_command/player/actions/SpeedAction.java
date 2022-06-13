package cn.chitucao.designpattern.b6_command.player.actions;

import cn.chitucao.designpattern.b6_command.player.GPlayer;
import cn.chitucao.designpattern.b6_command.player.IAction;

/**
 * Created by Tom.
 */
public class SpeedAction implements IAction {
    private GPlayer gplayer;

    public SpeedAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    @Override
    public void execute() {
        gplayer.speed();
    }
}
