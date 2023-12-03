from beet import JsonFile
# Intended to be placed in the pack root!


def add_wood(wood_type, condition_id):
    # each block needs a model and a blockstate
    # ww logs
    if condition_id[:9] != "minecraft" and condition_id[:10] != "wilderwild" and wood_type != "bamboo":
        # hlog model
        json_file = {
            "parent": "wilderwild:block/template_hollowed_log",
            "textures": {
                "top": "astound:block/" + condition_id.replace(":", "_hollowed_") + "_" + wood_type + "_top",
                "inner": "astound:block/" + condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type,
                "outer": "astound:block/" + condition_id.replace(":", "_hollowed_") + "_" + wood_type
            }
        }
        JsonFile(json_file).dump("assets/astound/models/block/",
                                 condition_id.replace(":", "_hollowed_") + "_" + wood_type + ".json")
        # hlog hand model
        json_file = {
            "parent": "assets/astound/models/block/" +
                      condition_id.replace(":", "_hollowed_") + "_" + wood_type + ".json"
        }
        JsonFile(json_file).dump("assets/astound/models/item/",
                                 condition_id.replace(":", "_hollowed_") + "_" + wood_type + ".json")
        # shlog model
        json_file = {
            "parent": "wilderwild:block/template_hollowed_log",
            "textures": {
                "top": "astound:block/" + condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type + "_top",
                "inner": "astound:block/" + condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type,
                "outer": "astound:block/" + condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type
            }
        }
        JsonFile(json_file).dump("assets/astound/models/block/",
                                 condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type + ".json")
        # shlog hand model
        json_file = {
            "parent": "assets/astound/models/block/" +
                      condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type + ".json"
        }
        JsonFile(json_file).dump("assets/astound/models/item/",
                                 condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type + ".json")
        # hlog blockstate
        json_file = {
            "variants": {
                "axis=x": {
                    "model": "astound:block/" + condition_id.replace(":", "_hollowed_") + "_" + wood_type,
                    "x": 90,
                    "y": 90
                },
                "axis=y": {
                    "model": "astound:block/" + condition_id.replace(":", "_hollowed_") + "_" + wood_type
                },
                "axis=z": {
                    "model": "astound:block/" + condition_id.replace(":", "_hollowed_") + "_" + wood_type,
                    "x": 90
                }
            }
        }
        JsonFile(json_file).dump("assets/astound/blockstates/",
                                 condition_id.replace(":", "_hollowed_") + "_" + wood_type + ".json")
        # shlog blockstate
        json_file = {
            "variants": {
                "axis=x": {
                    "model": "astound:block/" + condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type,
                    "x": 90,
                    "y": 90
                },
                "axis=y": {
                    "model": "astound:block/" + condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type
                },
                "axis=z": {
                    "model": "astound:block/" + condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type,
                    "x": 90
                }
            }
        }
        JsonFile(json_file).dump("assets/astound/blockstates/",
                                 condition_id.replace(":", "_stripped_hollowed_") + "_" + wood_type + ".json")
    # trims, panels, ladders and bookshelves
    if condition_id[:9] != "minecraft":
        # trim model
        json_file = {
            "parent": "block/cube_bottom_top",
            "textures": {
                "top": "astound:block/" + condition_id.replace(":", "_") + "_top",
                "side": "astound:block/" + condition_id.replace(":", "_") + "_trim",
                "bottom": "astound:block/" + condition_id.replace(":", "_") + "_top"
            }
        }

        JsonFile(json_file).dump("assets/astound/models/block/", condition_id.replace(":", "_") + "_trim.json")
        # trim hand model
        json_file = {
            "parent": "assets/astound/models/block/" + condition_id.replace(":", "_") + "_trim.json"
        }
        JsonFile(json_file).dump("assets/astound/models/item/",
                                 condition_id.replace(":", "_") + "_trim.json")
        # panel model
        json_file = {
            "parent": "block/cube_bottom_top",
            "textures": {
                "top": "astound:block/" + condition_id.replace(":", "_") + "_top",
                "side": "astound:block/" + condition_id.replace(":", "_") + "_panel",
                "bottom": "astound:block/" + condition_id.replace(":", "_") + "_top"
            }
        }
        JsonFile(json_file).dump("assets/astound/models/block/", condition_id.replace(":", "_") + "_panel.json")
        # panel hand model
        json_file = {
            "parent": "assets/astound/models/block/" + condition_id.replace(":", "_") + "_panel.json"
        }
        JsonFile(json_file).dump("assets/astound/models/item/",
                                 condition_id.replace(":", "_") + "_panel.json")
        # trim blockstate
        json_file = {
            "variants": {
                "": {
                    "model": "astound:block/" + condition_id.replace(":", "_") + "_trim"
                }
            }
        }
        JsonFile(json_file).dump("assets/astound/blockstates/", condition_id.replace(":", "_") + "_trim.json")
        # panel blockstate
        json_file = {
            "variants": {
                "": {
                    "model": "astound:block/" + condition_id.replace(":", "_") + "_panel"
                }
            }
        }
        JsonFile(json_file).dump("assets/astound/blockstates/", condition_id.replace(":", "_") + "_panel.json")
        # ladder model
        if condition_id[:11] == "pearfection":
            json_file = {
                "ambientocclusion": False,
                "textures": {
                    "particle": "pearfection:block/callery_ladder",
                    "texture": "pearfection:block/callery_ladder"
                },
                "elements": [
                    {"from": [0, 0, 15.2],
                     "to": [16, 16, 15.2],
                     "shade": False,
                     "faces": {
                         "north": {"uv": [0, 0, 16, 16], "texture": "#texture"},
                         "south": {"uv": [16, 0, 0, 16], "texture": "#texture"}
                     }
                     }
                ]
            }
        else:
            json_file = {
                "ambientocclusion": False,
                "textures": {
                    "particle": "astound:block/" + condition_id.replace(":", "_") + "_ladder",
                    "texture": "astound:block/" + condition_id.replace(":", "_") + "_ladder"
                },
                "elements": [
                    {"from": [0, 0, 15.2],
                     "to": [16, 16, 15.2],
                     "shade": False,
                     "faces": {
                         "north": {"uv": [0, 0, 16, 16], "texture": "#texture"},
                         "south": {"uv": [16, 0, 0, 16], "texture": "#texture"}
                     }
                     }
                ]
            }
        JsonFile(json_file).dump("assets/astound/models/block/", condition_id.replace(":", "_") + "_ladder.json")
        # ladder hand model
        if condition_id[:11] == "pearfection":
            json_file = {
                "parent": "minecraft:item/generated",
                "textures": {
                    "layer0": "pearfection:block/callery_ladder"
                }
            }
        else:
            json_file = {
                "parent": "minecraft:item/generated",
                "textures": {
                    "layer0": "astound:block/" + condition_id.replace(":", "_") + "_ladder"
                }
            }
        JsonFile(json_file).dump("assets/astound/models/item/",
                                 condition_id.replace(":", "_") + "_ladder.json")
        # bookshelf model
        if condition_id[:11] == "pearfection":  # there's built in callery bookshelf/ladder textures in pearfection
            json_file = {
                "parent": "minecraft:block/cube_column",
                "textures": {
                    "end": condition_id.replace(":", ":block/") + "_planks",
                    "side": "pearfection:block/callery_bookshelf"
                }
            }
        elif condition_id[:9] == "promenade":  # promenade stores all of its textures in subfolders
            json_file = {
                "parent": "minecraft:block/cube_column",
                "textures": {
                    "end": condition_id.replace(":", ":block/") + "/planks",
                    "side": "astound:block/" + condition_id.replace(":", "_") + "_bookshelf"
                }
            }
        else:
            json_file = {
                "parent": "minecraft:block/cube_column",
                "textures": {
                    "end": condition_id.replace(":", ":block/") + "_planks",
                    "side": "astound:block/" + condition_id.replace(":", "_") + "_bookshelf"
                }
            }
        JsonFile(json_file).dump("assets/astound/models/block/", condition_id.replace(":", "_") + "_bookshelf.json")
        # bookshelf hand model
        json_file = {
            "parent": "assets/astound/models/block/" + condition_id.replace(":", "_") + "_bookshelf.json"
        }
        JsonFile(json_file).dump("assets/astound/models/item/",
                                 condition_id.replace(":", "_") + "_bookshelf.json")
        # ladder blockstate
        json_file = {
            "variants": {
                "facing=east": {
                    "model": "astound:block/" + condition_id.replace(":", "_") + "_ladder",
                    "y": 90
                },
                "facing=north": {
                    "model": "astound:block/" + condition_id.replace(":", "_") + "_ladder"
                },
                "facing=south": {
                    "model": "astound:block/" + condition_id.replace(":", "_") + "_ladder",
                    "y": 180
                },
                "facing=west": {
                    "model": "astound:block/" + condition_id.replace(":", "_") + "_ladder",
                    "y": 270
                }
            }
        }
        JsonFile(json_file).dump("assets/astound/blockstates/", condition_id.replace(":", "_") + "_ladder.json")
        # bookshelf blockstate
        json_file = {
            "variants": {
                "": {
                    "model": "astound:block/" + condition_id.replace(":", "_") + "_bookshelf"
                }
            }
        }
        JsonFile(json_file).dump("assets/astound/blockstates/", condition_id.replace(":", "_") + "_bookshelf.json")


wood_type_list = [
    "minecraft:oak",
    "minecraft:spruce",
    "minecraft:jungle",
    "minecraft:birch",
    "minecraft:acacia",
    "minecraft:dark_oak",
    "minecraft:cherry",
    "minecraft:mangrove",
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
    "minecraft:crimson",
    "minecraft:warped",
    "promenade:dark_amaranth",
    "cinderscapes:scorched",
    "cinderscapes:umbral",
    "gardens_of_the_dead:soulblight",
    "pearfection:callery"
]
bamboo_list = [
    "minecraft:bamboo",
    "gardens_of_the_dead:whistlecane"
]
for i in wood_type_list:
    add_wood("log", i)
for i in stem_type_list:
    add_wood("stem", i)
for i in bamboo_list:
    add_wood("bamboo", i)
