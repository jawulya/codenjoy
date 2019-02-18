package com.epam.dojo.icancode.model;

/*-
 * #%L
 * iCanCode - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2016 EPAM
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.profile.Profiler;
import com.codenjoy.dojo.services.EventListener;
import com.codenjoy.dojo.services.Game;
import com.codenjoy.dojo.utils.TestUtils;
import com.epam.dojo.icancode.services.GameRunner;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;

/**
 * Created by Sanja on 15.02.14.
 */
public class ICanCodePerformanceTest {

    @Test // TODO закончить как будет настроение :)
    public void test() {
        GameRunner iCanCode = new GameRunner();

        List<com.codenjoy.dojo.services.Game> games = new LinkedList<>();

        for (int index = 0; index < 50; index++) {
            Game game = TestUtils.buildGame(iCanCode,
                    mock(EventListener.class),
                    iCanCode.getPrinterFactory());
            games.add(game);
        }

        Profiler profiler = new Profiler();

        profiler.start();
        for (Game game : games) {
            game.getBoardAsString();
            profiler.done("getBoardAsString");
        }
        profiler.print();
    }
}