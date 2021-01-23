package com.github.nikbenson.roleplaybot.modules.character;

import com.github.nikbenson.roleplaybot.modules.ModulesManager;
import com.github.nikbenson.roleplaybot.modules.RoleplayBotModule;
import com.github.nikbenson.roleplaybot.modules.player.PlayerModule;
import net.dv8tion.jda.api.entities.Guild;

public class CharacterModule implements RoleplayBotModule {
	private PlayerModule playerModule;

	public CharacterModule() {
		playerModule = (PlayerModule) ModulesManager.require("com.github.nikbenson.roleplaybot.modules.player.PlayerModule");
	}

	@Override
	public boolean isActive(Guild guild) {
		return false;
	}

	@Override
	public void load(Guild guild) {

	}

	@Override
	public void unload(Guild guild) {

	}

	@Override
	public Guild[] getLoaded() {
		return new Guild[0];
	}
}
