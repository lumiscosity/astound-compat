from beet import JsonFile

# Intended to be placed in the pack root! Exports to the "data_ac" folder instead of the "data" folder.


wood_type_list = [
    "promenade:sakura",
    "promenade:maple",
    "great_big_world:aspen",
    "great_big_world:mahogany",
    "great_big_world:acai",
    "promenade:palm",
    "wilderwild:baobab",
    "wilderwild:cypress",
    "wilderwild:palm",
    "traverse:fir",
    "biomemakeover:blighted_balsa",
    "biomemakeover:willow",
    "biomemakeover:swamp_cypress",
    "biomemakeover:ancient_oak",
    "snifferplus:stone_pine"
]
stem_type_list = [
    "promenade:dark_amaranth",
    "cinderscapes:scorched",
    "cinderscapes:umbral",
    "gardens_of_the_dead:soulblight",
    "pearfection:callery"
]
bamboo_list = [
    "gardens_of_the_dead:whistlecane"
]
burnable_list = [
    "promenade:sakura",
    "promenade:maple",
    "great_big_world:aspen",
    "great_big_world:mahogany",
    "great_big_world:acai",
    "promenade:palm",
    "wilderwild:baobab",
    "wilderwild:cypress",
    "wilderwild:palm",
    "traverse:fir",
    "biomemakeover:blighted_balsa",
    "biomemakeover:willow",
    "biomemakeover:swamp_cypress",
    "biomemakeover:ancient_oak",
    "snifferplus:stone_pine",
    "promenade:dark_amaranth",
    "gardens_of_the_dead:soulblight",
    "pearfection:callery"
]
unburnable_list = [
    "cinderscapes:scorched",
    "cinderscapes:umbral",
]
core_cond_list = wood_type_list.copy() + stem_type_list.copy() + bamboo_list.copy()
# wooden ladders itag
cond_list = core_cond_list.copy()
for i in range(len(cond_list)):
    cond_list[i] = "astound:" + cond_list[i].replace(":", "_") + "_ladder"
json_file = {"replace": False, "values": cond_list}
JsonFile(json_file).dump(origin="data_ac/jineric/tags/items/", path="wooden_ladders.json")
# wooden ladders btag
cond_list = core_cond_list.copy()
for i in range(len(cond_list)):
    cond_list[i] = "astound:" + cond_list[i].replace(":", "_") + "_ladder"
json_file = {"replace": False, "values": cond_list}
JsonFile(json_file).dump(origin="data_ac/jineric/tags/blocks/", path="wooden_ladders.json")
# wooden bookshelves itag
cond_list = core_cond_list.copy()
for i in range(len(cond_list)):
    cond_list[i] = "astound:" + cond_list[i].replace(":", "_") + "_bookshelf"
json_file = {"replace": False, "values": cond_list}
JsonFile(json_file).dump(origin="data_ac/jineric/tags/items/", path="wooden_ladders.json")
# wooden bookshelves btag
cond_list = core_cond_list.copy()
for i in range(len(cond_list)):
    cond_list[i] = "astound:" + cond_list[i].replace(":", "_") + "_bookshelf"
json_file = {"replace": False, "values": cond_list}
JsonFile(json_file).dump(origin="data_ac/jineric/tags/blocks/", path="wooden_ladders.json")
# (s)hlog tags
# (s)hlogs are in the respective mods' log tag,
# and either the flammable or non-flammable (stripped) hollowed log tag.
# both of these have itag and btag versions.
# everything else is handled automatically.
# flammable
cond_list = burnable_list.copy()
dump_list = []
for i in range(len(cond_list)):
    if cond_list[i][:10] == "wilderwild":
        continue
    if cond_list[i] in wood_type_list:
        dump_list.append("astound:" + cond_list[i].replace(":", "_hollowed_") + "_log")
        dump_list.append("astound:" + cond_list[i].replace(":", "_stripped_hollowed_") + "_log")
    else:
        dump_list.append("astound:" + cond_list[i].replace(":", "_hollowed_") + "_stem")
        dump_list.append("astound:" + cond_list[i].replace(":", "_stripped_hollowed_") + "_stem")
json_file = {"replace": False, "values": dump_list}
JsonFile(json_file).dump(origin="data_ac/wilderwild/tags/items/", path="hollowed_logs_that_burn.json")
JsonFile(json_file).dump(origin="data_ac/wilderwild/tags/blocks/", path="hollowed_logs_that_burn.json")
# nonflammable
cond_list = unburnable_list.copy()
dump_list = []
for i in range(len(cond_list)):
    if cond_list[i][:10] == "wilderwild":
        continue
    if cond_list[i] in wood_type_list:
        dump_list.append("astound:" + cond_list[i].replace(":", "_hollowed_") + "_log")
        dump_list.append("astound:" + cond_list[i].replace(":", "_stripped_hollowed_") + "_log")
    else:
        dump_list.append("astound:" + cond_list[i].replace(":", "_hollowed_") + "_stem")
        dump_list.append("astound:" + cond_list[i].replace(":", "_stripped_hollowed_") + "_stem")
json_file = {"replace": False, "values": dump_list}
JsonFile(json_file).dump(origin="data_ac/wilderwild/tags/items/", path="hollowed_logs_dont_burn.json")
JsonFile(json_file).dump(origin="data_ac/wilderwild/tags/blocks/", path="hollowed_logs_dont_burn.json")
# log
cond_list = wood_type_list.copy() + stem_type_list.copy()
for i in range(len(cond_list)):
    dump_list = []
    wood = cond_list[i]
    if wood[:10] == "wilderwild":
        continue
    if cond_list[i] in wood_type_list:
        dump_list.append("astound:" + cond_list[i].replace(":", "_hollowed_") + "_log")
        dump_list.append("astound:" + cond_list[i].replace(":", "_stripped_hollowed_") + "_log")
        json_file = {"replace": False, "values": dump_list}
        JsonFile(json_file).dump(origin="data_ac/" + wood[:wood.index(":")] + "/tags/items/",
                                 path=wood.split(":")[1] + "_logs.json")
        JsonFile(json_file).dump(origin="data_ac/" + wood[:wood.index(":")] + "/tags/blocks/",
                                 path=wood.split(":")[1] + "_logs.json")
    else:
        dump_list.append("astound:" + cond_list[i].replace(":", "_hollowed_") + "_stem")
        dump_list.append("astound:" + cond_list[i].replace(":", "_stripped_hollowed_") + "_stem")
        json_file = {"replace": False, "values": dump_list}
        JsonFile(json_file).dump(origin="data_ac/" + wood[:wood.index(":")] + "/tags/items/",
                                 path=wood.split(":")[1] + "_stems.json")
        JsonFile(json_file).dump(origin="data_ac/" + wood[:wood.index(":")] + "/tags/blocks/",
                                 path=wood.split(":")[1] + "_stems.json")
# trims and panels just need the mineable tag
print(core_cond_list)
cond_list = core_cond_list.copy()
dump_list = []
for i in range(len(cond_list)):
    dump_list.append("astound:" + cond_list[i].replace(":", "_") + "_trim")
    dump_list.append("astound:" + cond_list[i].replace(":", "_") + "_panel")
json_file = {"replace": False, "values": dump_list}
JsonFile(json_file).dump(origin="data_ac/minecraft/tags/blocks/mineable/", path="axe.json")

# recipes
cond_list = core_cond_list.copy()
for i in cond_list:
    # ladders
    json_file = {
        "type": "minecraft:crafting_shaped",
        "group": "wooden_ladder",
        "key": {
            "#": {
                "item": i + "_planks"
            },
            "%": {
                "item": "minecraft:stick"
            }
        },
        "pattern": [
            "# #",
            "#%#",
            "# #"
        ],
        "result": {
            "count": 8,
            "item": "astound:" + i.replace(":", "_") + "_ladder"
        }
    }
    JsonFile(json_file).dump(origin="data_ac/astound/recipes/", path=i.replace(":", "_") + "_ladder.json")
    # bookshelves
    json_file = {
        "type": "minecraft:crafting_shaped",
        "group": "wooden_bookshelf",
        "pattern": [
            "###",
            "%%%",
            "###"
        ],
        "key": {
            "#": {
                "item": i + "_planks"
            },
            "%": {
                "item": "minecraft:book"
            }
        },
        "result": {
            "item": "astound:" + i.replace(":", "_") + "_bookshelf",
            "count": 1
        }
    }
    JsonFile(json_file).dump(origin="data_ac/astound/recipes/", path=i.replace(":", "_") + "_bookshelf.json")
    # trims
    json_file = {
        "type": "minecraft:crafting_shaped",
        "key": {
            "#": {
                "item": i + "_planks"
            }
        },
        "pattern": [
            "#",
            "#",
            "#"
        ],
        "result": {
            "count": 3,
            "item": "astound:" + i.replace(":", "_") + "_trim"
        },
        "show_notification": True
    }
    JsonFile(json_file).dump(origin="data_ac/astound/recipes/", path=i.replace(":", "_") + "_trim.json")
    # panels
    json_file = {
        "type": "minecraft:crafting_shaped",
        "key": {
            "#": {
                "item": "astound:" + i.replace(":", "_") + "_trim"
            }
        },
        "pattern": [
            "#",
            "#",
            "#"
        ],
        "result": {
            "count": 3,
            "item": "astound:" + i.replace(":", "_") + "_panel"
        },
        "show_notification": True
    }
    JsonFile(json_file).dump(origin="data_ac/astound/recipes/", path=i.replace(":", "_") + "_panel.json")

# loot tables
# ladders, panels, trims, hollowed logs and stripped hollow logs just drop themselves
cond_list = core_cond_list.copy()
for i in cond_list:
    json_file = {
        "type": "minecraft:block",
        "pools": [
            {
                "rolls": 1,
                "entries": [
                    {
                        "type": "minecraft:item",
                        "name": "astound:" + i.replace(":", "_") + "_ladder"
                    }
                ]
            }
        ]
    }
    JsonFile(json_file).dump(origin="data_ac/astound/loot_tables/blocks/", path=i.replace(":", "_") + "_ladder.json")
    json_file = {
        "type": "minecraft:block",
        "pools": [
            {
                "rolls": 1,
                "entries": [
                    {
                        "type": "minecraft:item",
                        "name": "astound:" + i.replace(":", "_") + "_trim"
                    }
                ]
            }
        ]
    }
    JsonFile(json_file).dump(origin="data_ac/astound/loot_tables/blocks/", path=i.replace(":", "_") + "_trim.json")
    json_file = {
        "type": "minecraft:block",
        "pools": [
            {
                "rolls": 1,
                "entries": [
                    {
                        "type": "minecraft:item",
                        "name": "astound:" + i.replace(":", "_") + "_panel"
                    }
                ]
            }
        ]
    }
    JsonFile(json_file).dump(origin="data_ac/astound/loot_tables/blocks/", path=i.replace(":", "_") + "_panel.json")
cond_list = wood_type_list.copy() + stem_type_list.copy()
json_file = {
    "type": "minecraft:block",
    "pools": [
        {
            "rolls": 1,
            "entries": [
                {
                    "type": "minecraft:item",
                    "name": "bogus"
                }
            ]
        }
    ]
}
for i in range(len(cond_list)):
    if cond_list[i][:10] == "wilderwild":
        continue
    if cond_list[i] in wood_type_list:
        json_file["pools"][0]["entries"][0]["name"] = "astound:" + cond_list[i].replace(":", "_hollowed_") + "_log"
        JsonFile(json_file).dump(origin="data_ac/astound/loot_tables/blocks/",
                                 path=cond_list[i].replace(":", "_hollowed_") + "_log.json")
        json_file["pools"][0]["entries"][0]["name"] = "astound:" + cond_list[i].replace(":",
                                                                                        "_stripped_hollowed_") + "_log"
        JsonFile(json_file).dump(origin="data_ac/astound/loot_tables/blocks/",
                                 path=cond_list[i].replace(":", "_stripped_hollowed_") + "_log.json")
    else:
        json_file["pools"][0]["entries"][0]["name"] = "astound:" + cond_list[i].replace(":", "_hollowed_") + "_stem"
        JsonFile(json_file).dump(origin="data_ac/astound/loot_tables/blocks/",
                                 path=cond_list[i].replace(":", "_hollowed_") + "_stem.json")
        json_file["pools"][0]["entries"][0]["name"] = "astound:" + cond_list[i].replace(":",
                                                                                        "_stripped_hollowed_") + "_stem"
        JsonFile(json_file).dump(origin="data_ac/astound/loot_tables/blocks/",
                                 path=cond_list[i].replace(":", "_stripped_hollowed_") + "_stem.json")
# bookshelves drop books without silk touch
cond_list = core_cond_list.copy()
for i in cond_list:
    json_file = {
        "type": "minecraft:block",
        "pools": [
            {
                "bonus_rolls": 0.0,
                "entries": [
                    {
                        "type": "minecraft:alternatives",
                        "children": [
                            {
                                "type": "minecraft:item",
                                "conditions": [
                                    {
                                        "condition": "minecraft:match_tool",
                                        "predicate": {
                                            "enchantments": [
                                                {
                                                    "enchantment": "minecraft:silk_touch",
                                                    "levels": {
                                                        "min": 1
                                                    }
                                                }
                                            ]
                                        }
                                    }
                                ],
                                "name": "astound:" + i.replace(":", "_") + "_bookshelf"
                            },
                            {
                                "type": "minecraft:item",
                                "functions": [
                                    {
                                        "add": False,
                                        "count": 3.0,
                                        "function": "minecraft:set_count"
                                    },
                                    {
                                        "function": "minecraft:explosion_decay"
                                    }
                                ],
                                "name": "minecraft:book"
                            }
                        ]
                    }
                ],
                "rolls": 1
            }
        ]
    }
    JsonFile(json_file).dump(origin="data_ac/astound/loot_tables/blocks/", path=i.replace(":", "_") + "_bookshelf.json")
