package com.lea.pattern_9_command.command;

/**
 * @author lzc
 * @create 2020-11-17 10:05
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
