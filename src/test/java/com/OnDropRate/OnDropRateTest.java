package com.OnDropRate;

import com.OnDropRate.OnDropRatePlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class OnDropRateTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(OnDropRatePlugin.class);
		RuneLite.main(args);
	}
}