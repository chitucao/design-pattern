package cn.chitucao.designpattern.b6_command.player.actions;

import cn.chitucao.designpattern.b6_command.player.GPlayer;
import cn.chitucao.designpattern.b6_command.player.IAction;

/**
 * Created by Tom.
 */
public class PlayAction implements IAction {
    private GPlayer gplayer;

    public PlayAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    @Override
    public void execute() {
        gplayer.play();
    }
}
