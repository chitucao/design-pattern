package cn.chitucao.designpattern.b3_command.player.actions;

import cn.chitucao.designpattern.b3_command.player.GPlayer;
import cn.chitucao.designpattern.b3_command.player.IAction;

/**
 * Created by Tom.
 */
public class PauseAction implements IAction {
    private GPlayer gplayer;

    public PauseAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    @Override
    public void execute() {
        gplayer.pause();
    }
}
