package T145.elementalcreepers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ElementalCreepers.MODID, name = ElementalCreepers.NAME, version = ElementalCreepers.VERSION, updateJSON = ElementalCreepers.UPDATE_JSON)
public class ElementalCreepers {

	public static final String MODID = "elementalcreepers";
	public static final String NAME = "ElementalCreepers";
	public static final String VERSION = "$version";
	public static final String UPDATE_JSON = "https://github.com/T145/elemental-creepers/blob/master/update.json";
	public static final Logger LOG = LogManager.getLogger(MODID);

	@Instance(MODID)
	public static ElementalCreepers instance;

	@Metadata
	private ModMetadata meta;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		meta.authorList.add("T145");
		meta.autogenerated = false;
		meta.credits = "The fans!";
		meta.description = "Here comes the BOOM!";
		meta.logoFile = "logo.png";
		meta.modId = MODID;
		meta.name = NAME;
		meta.url = "https://github.com/T145/elemental-creepers";
		meta.useDependencyInformation = false;
		meta.version = VERSION;
	}
}