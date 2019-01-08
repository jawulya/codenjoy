package com.codenjoy.dojo.web.rest.pojo;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2018 - 2019 Codenjoy
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

import com.codenjoy.dojo.services.Player;

public class PlayerInfo {
    private String gameType;
    private String callbackUrl;
    private String name;
    private String score;
    private String code;

    public PlayerInfo(Player player) {
        gameType = player.getGameType().name();
        callbackUrl = player.getCallbackUrl();
        name = player.getName();
        score = String.valueOf(player.getScore());
        code = player.getCode();
    }

    public String getGameType() {
        return gameType;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }

    public String getCode() {
        return code;
    }
}