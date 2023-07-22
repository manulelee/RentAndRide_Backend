package com.epicode.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.epicode.enumerations.CategoryType;
import com.epicode.models.Equipment;
import com.epicode.services.EquipmentService;

@Component
@Order(2)
public class EquipmentRunner implements ApplicationRunner{
	
	@Autowired EquipmentService equipmentService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		if (equipmentService.getAllEquiment().isEmpty()) 
		{
			System.out.println("Populate equipment table");
			insertSurfEquipment();
			insertKitesurfEquipment();
			insertWindsurfEquipment();
			insertWakeboardEquipment();
		}
		
	}

	// Insert surf equipment on DB
	public void insertSurfEquipment () {
		
		Equipment sb1 = new Equipment();
		sb1.setBrand("Channel Islands");
		sb1.setModel("DFR");
		sb1.setCategory(CategoryType.SURF);
		sb1.setSize("6’0″ x 19″ x 2 3/8″");
		sb1.setDescription("No, not the “Dane Fred Rubble” the DFR is a design from Dane freaking Reynolds. First ridden in 2012 and a staple on the world tour, the DFR is an ultra-modern short board, the plan-shape allows for a short rail line while maintaining drive.");
		sb1.setPrice(35.0);
		sb1.setImg("https://cisurfboards.com/cdn/shop/products/dfr_deck1.png?v=1619468606");
		equipmentService.createEquipment(sb1);
		
		Equipment sb2 = new Equipment();
		sb2.setBrand("Channel Islands");
		sb2.setModel("Fever");
		sb2.setCategory(CategoryType.SURF);
		sb2.setSize("6’0″ x 19 1/8″ x 2 7/16″");
		sb2.setDescription("The Fever has its roots in Al Merrick’s trusted and proven high-performance shortboard designs. With a slightly more parallel outline and forgiving rocker, the Fever has proven to be an all-around design that excels in a wide range of conditions and wave.");
		sb2.setPrice(35.0);
		sb2.setImg("https://cisurfboards.com/cdn/shop/products/Pat-G-Fever-Deck.png?v=1619470425");
		equipmentService.createEquipment(sb2);
		
		Equipment sb3 = new Equipment();
		sb3.setBrand("Channel Islands");
		sb3.setModel("Average Joe");
		sb3.setCategory(CategoryType.SURF);
		sb3.setSize("5’7″ x 21 7/8″ x 2 5/8″");
		sb3.setDescription("Light single concave for the first 1/3 to deepening concave vee throughout. The Joe can be surfed off the rail or tail that has an hip tail template to keep drive. Full rails keep high volume in a short outline. Increase wave count, make more sections.");
		sb3.setPrice(35.0);
		sb3.setImg("https://cisurfboards.com/cdn/shop/products/joe_deck1.png?v=1619468440");
		equipmentService.createEquipment(sb3);
		
		Equipment sb4 = new Equipment();
		sb4.setBrand("Channel Islands");
		sb4.setModel("Happy Everyday");
		sb4.setCategory(CategoryType.SURF);
		sb4.setSize("5’10″ x 19 3/4″ x 2 1/2″");
		sb4.setDescription("The single concave under the front foot acts as a gas pedal and generous double concave through the fins provides rail-to-rail ease and plenty of lift in the small stuff.");
		sb4.setPrice(35.0);
		sb4.setImg("https://cisurfboards.com/cdn/shop/products/Happy_Everyday_Deck.png?v=1645726552");
		equipmentService.createEquipment(sb4);
		
		Equipment sb5 = new Equipment();
		sb5.setBrand("Lost");
		sb5.setModel("Rocket Redux");
		sb5.setCategory(CategoryType.SURF);
		sb5.setSize("5’10″ x 20″ x 2 1/2″");
		sb5.setDescription("From Bros to Pros, The ROCKET was soon a global hit, being enjoyed by surfers of all shapes, sizes and skill sets. Now, more than a decade after its initial release, the ROCKET returns. A re-incarnated Redux for the new generation to enjoy another run…");
		sb5.setPrice(35.0);
		sb5.setImg("https://lostsurfboards.net/wp-content/uploads/2019/11/ROCKET_REDUX-1.png");
		equipmentService.createEquipment(sb5);
		
		Equipment sb6 = new Equipment();
		sb6.setBrand("Lost");
		sb6.setModel("Puddle Jumper HP");
		sb6.setCategory(CategoryType.SURF);
		sb6.setSize("5’7″ x 20 1/4″ x 2 1/2″");
		sb6.setDescription("The Puddle Jumper HP can take the domesticated gentleman into a realm thought long gone. Speed, with quickness, fast but loose, precise but playful. This board allows you to take your small wave surfing to the next level.");
		sb6.setPrice(35.0);
		sb6.setImg("https://lostsurfboards.net/wp-content/uploads/2019/01/PJHP.png");
		equipmentService.createEquipment(sb6);
		
		Equipment sb7 = new Equipment();
		sb7.setBrand("Lost");
		sb7.setModel("Sub Driver 2.0");
		sb7.setCategory(CategoryType.SURF);
		sb7.setSize("6’0″ x 20″ x 2 1/2″");
		sb7.setDescription("Our best small wave, performance shortboard just got better! The SUB DRIVER 2.0 was derived to benefit the Pros, yet it really is perfect for most “Bros”.");
		sb7.setPrice(35.0);
		sb7.setImg("https://lostsurfboards.net/wp-content/uploads/2020/08/sub-driver-2-1.jpg");
		equipmentService.createEquipment(sb7);
		
		Equipment sb8 = new Equipment();
		sb8.setBrand("Pukas");
		sb8.setModel("Acid Plan");
		sb8.setCategory(CategoryType.SURF);
		sb8.setSize("5’10″ x 20 1/4″ x 2 1/2″");
		sb8.setDescription("THREE WORDS FOR ACID PLAN: TWIN-FIN, ALTERNATIVE & RADICAL. We bring you a whole new buddy for high performance. Having high performance in mind, this shape here stands between the twin-fin and the thruster, bringing the best out of the two worlds.");
		sb8.setPrice(35.0);
		sb8.setImg("https://pukassurf.wpenginepowered.com/wp-content/uploads/sites/3/sites/3/2022/07/Pukas-Surfboards-Acid-Plan-2048x1448.jpg");
		equipmentService.createEquipment(sb8);
		
		Equipment sb9 = new Equipment();
		sb9.setBrand("Pukas");
		sb9.setModel("Hyper-Link");
		sb9.setCategory(CategoryType.SURF);
		sb9.setSize("6’0″ x 20 1/2″ x 2 1/2″");
		sb9.setDescription("SWIFT TURNS, SPEEDY & RESPONSIVE. The Hyperlink is an exclusive Pukas Surfboard designed by Matt Biolos (Mayhem) just for European waves. So, there’s a reason for 10 years of collaboration between Pukas and Mayhem behind it.");
		sb9.setPrice(35.0);
		sb9.setImg("https://pukassurf.wpenginepowered.com/wp-content/uploads/sites/3/sites/3/2022/05/Pukas-Surfboards-Hyper-Link-2048x1448.jpg");
		equipmentService.createEquipment(sb9);
		
		Equipment sb10 = new Equipment();
		sb10.setBrand("FireWire");
		sb10.setModel("TJ Everyday");
		sb10.setCategory(CategoryType.SURF);
		sb10.setSize("9’0″ x 23 1/4″ x 2 7/8″");
		sb10.setDescription("The TJ EVERYDAY has a slightly thicker foil, lower entry rocker and flatter bottom concaves, allowing for a balance between performance and nose riding.");
		sb10.setPrice(40.0);
		sb10.setImg("https://cdn.shopify.com/s/files/1/0399/4923/8317/products/tj-everyday-738622_900x.jpg?v=1645640471");
		equipmentService.createEquipment(sb10);
	}
	
	// Insert kitesurf equipment on DB
	public void insertKitesurfEquipment () {
		
		Equipment ks1 = new Equipment();
		ks1.setBrand("Duotone");
		ks1.setModel("Neo SLS");
		ks1.setCategory(CategoryType.KITESURF);
		ks1.setSize("9");
		ks1.setDescription("The best wave kite on the market got the SLS treatment; stronger, lighter, and superior, with Penta TX and Trinity TX combining to make a super light and durable kite.");
		ks1.setPrice(27.0);
		ks1.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62c5/6086/cc9d/9200/d167/125c/xlarge/NEO23_SLS_CC04.png?1657102436");
		equipmentService.createEquipment(ks1);
		
		Equipment ks2 = new Equipment();
		ks2.setBrand("Duotone");
		ks2.setModel("Neo SLS");
		ks2.setCategory(CategoryType.KITESURF);
		ks2.setSize("11");
		ks2.setDescription("The best wave kite on the market got the SLS treatment; stronger, lighter, and superior, with Penta TX and Trinity TX combining to make a super light and durable kite.");
		ks2.setPrice(27.0);
		ks2.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62c5/6086/cc9d/9200/d167/125c/xlarge/NEO23_SLS_CC04.png?1657102436");
		equipmentService.createEquipment(ks2);
		
		Equipment ks3 = new Equipment();
		ks3.setBrand("Duotone");
		ks3.setModel("Neo SLS");
		ks3.setCategory(CategoryType.KITESURF);
		ks3.setSize("13");
		ks3.setDescription("The best wave kite on the market got the SLS treatment; stronger, lighter, and superior, with Penta TX and Trinity TX combining to make a super light and durable kite.");
		ks3.setPrice(27.0);
		ks3.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62c5/6086/cc9d/9200/d167/125c/xlarge/NEO23_SLS_CC04.png?1657102436");
		equipmentService.createEquipment(ks3);
		
		Equipment ks4 = new Equipment();
		ks4.setBrand("Duotone");
		ks4.setModel("Evo SLS");
		ks4.setCategory(CategoryType.KITESURF);
		ks4.setSize("10");
		ks4.setDescription("The best performance all-rounder in the Duotone line up! The Evo SLS is exceedingly capable as a freeride, big air, hooked freestyle, and with the SLS construction, delivers an unparalleled dynamic flying experience.");
		ks4.setPrice(27.0);
		ks4.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/630c/cce4/c5b4/8600/e5c6/8df2/xlarge/EVO23_SLS_C08_%281%29.png?1661783234");
		equipmentService.createEquipment(ks4);
		
		Equipment ks5 = new Equipment();
		ks5.setBrand("Duotone");
		ks5.setModel("Evo SLS");
		ks5.setCategory(CategoryType.KITESURF);
		ks5.setSize("12");
		ks5.setDescription("The best performance all-rounder in the Duotone line up! The Evo SLS is exceedingly capable as a freeride, big air, hooked freestyle, and with the SLS construction, delivers an unparalleled dynamic flying experience.");
		ks5.setPrice(27.0);
		ks5.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/630c/cce5/c5b4/8600/bdc6/95ed/xlarge/EVO23_SLS_C07_%281%29.png?1661783233");
		equipmentService.createEquipment(ks5);
		
		Equipment ks6 = new Equipment();
		ks6.setBrand("Duotone");
		ks6.setModel("Jamie SLS");
		ks6.setCategory(CategoryType.KITESURF);
		ks6.setSize("136");
		ks6.setDescription("The Jaime SLS is perfect for riders who like throwing down the odd freestyle trick and love to cruise around, but ultimately want the performance needed to get that highest jump record on the leader board at their home spot.");
		ks6.setPrice(13.0);
		ks6.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62c5/6bf0/cc9d/9200/bd67/1b16/xlarge/JAMIE23_SLS2.png?1657105358");
		equipmentService.createEquipment(ks6);
		
		Equipment ks7 = new Equipment();
		ks7.setBrand("Duotone");
		ks7.setModel("Spike");
		ks7.setCategory(CategoryType.KITESURF);
		ks7.setSize("136");
		ks7.setDescription("A light wind twin tip that doesn’t know what mowing the lawn means; this board is built for fun-filled performance no matter the conditions.");
		ks7.setPrice(13.0);
		ks7.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6315/d525/f91b/4200/e1a8/facf/xlarge/SPIKE23.png?1662375174");
		equipmentService.createEquipment(ks7);
		
		Equipment ks8 = new Equipment();
		ks8.setBrand("Duotone");
		ks8.setModel("Pace");
		ks8.setCategory(CategoryType.KITESURF);
		ks8.setSize("4'6");
		ks8.setDescription("The Pace SLS is the board to fulfill your need for speed when freeriding, smashing the latest freestyle tricks. A superlight prepreg carbon board, especially designed to be fast and in control, on the racecourse and in the air.");
		ks8.setPrice(20.0);
		ks8.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/60d0/43ff/ca27/c400/a88e/239c/xlarge/PACE22_SLS.png?1624261617");
		equipmentService.createEquipment(ks8);
		
		Equipment ks9 = new Equipment();
		ks9.setBrand("Duotone");
		ks9.setModel("Spirit");
		ks9.setCategory(CategoryType.KITESURF);
		ks9.setSize("75");
		ks9.setDescription("The Spirit 3.0 series is a solid aluminium mast offering loads of control and stability at incredible speed.");
		ks9.setPrice(13.0);
		ks9.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6138/cdcd/b137/1800/ae7d/1dc2/xlarge/Spirit_ALU_22_-_SURF1250.png?1631112639");
		equipmentService.createEquipment(ks9);
		
		Equipment ks10 = new Equipment();
		ks10.setBrand("Duotone");
		ks10.setModel("Whip");
		ks10.setCategory(CategoryType.KITESURF);
		ks10.setSize("5'3");
		ks10.setDescription("The Whip is a favourite among many riders; it is an incredible small to medium-sized wave board that can handle anything you throw at it. The compact shape also makes it perfect for strapless freestyle.");
		ks10.setPrice(23.0);
		ks10.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62c5/6ee4/cc9d/9200/e567/1257/xlarge/WHIP23_SLS.png?1657106116");
		equipmentService.createEquipment(ks10);
	}
	
	// Insert windsurf equipment on DB
	public void insertWindsurfEquipment () {
		
		Equipment ws1 = new Equipment();
		ws1.setBrand("Duotone");
		ws1.setModel("Idol");
		ws1.setCategory(CategoryType.WINDSURF);
		ws1.setSize("4.0");
		ws1.setDescription("The lightest yet most competitive freestyle sail we have ever built!");
		ws1.setPrice(21.0);
		ws1.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/628f/56cd/4e2a/4b00/a855/520a/xlarge/DTW23_Idol_LTD_Rendering_C10_Web72_.png?1653561015");
		equipmentService.createEquipment(ws1);
		
		Equipment ws2 = new Equipment();
		ws2.setBrand("Duotone");
		ws2.setModel("Idol");
		ws2.setCategory(CategoryType.WINDSURF);
		ws2.setSize("5.0");
		ws2.setDescription("The lightest yet most competitive freestyle sail we have ever built!");
		ws2.setPrice(21.0);
		ws2.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/628f/56cd/4e2a/4b00/a855/520a/xlarge/DTW23_Idol_LTD_Rendering_C10_Web72_.png?1653561015");
		equipmentService.createEquipment(ws2);
		
		Equipment ws3 = new Equipment();
		ws3.setBrand("Duotone");
		ws3.setModel("Super Hero SLS");
		ws3.setCategory(CategoryType.WINDSURF);
		ws3.setSize("4.7");
		ws3.setDescription("SLS 2.0: the first sail featuring our groundbreaking monocoque fusion body construction");
		ws3.setPrice(21.0);
		ws3.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6304/e6e8/c5b4/8600/bdc6/8c79/xlarge/DTW23_SuperHERO_SLS_web72_final.png?1661265618");
		equipmentService.createEquipment(ws3);
		
		Equipment ws4 = new Equipment();
		ws4.setBrand("Duotone");
		ws4.setModel("Super Hero SLS");
		ws4.setCategory(CategoryType.WINDSURF);
		ws4.setSize("5.3");
		ws4.setDescription("SLS 2.0: the first sail featuring our groundbreaking monocoque fusion body construction");
		ws4.setPrice(21.0);
		ws4.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6304/e6e8/c5b4/8600/bdc6/8c79/xlarge/DTW23_SuperHERO_SLS_web72_final.png?1661265618");
		equipmentService.createEquipment(ws4);
		
		Equipment ws5 = new Equipment();
		ws5.setBrand("Goya");
		ws5.setModel("Guru X");
		ws5.setCategory(CategoryType.WINDSURF);
		ws5.setSize("4.2");
		ws5.setDescription("Built, designed and redesigned by Jason Diffin year after year over the past three decades, since the early 90’s to be precise, the Guru X is also the longest running sail in the Goya Windsurfing range.");
		ws5.setPrice(21.0);
		ws5.setImg("https://d2z2i12dpvcgkc.cloudfront.net/wp-content/uploads/2021/11/2022_Goya_Windsurfing_Guru_X_BBY@2x.jpg");
		equipmentService.createEquipment(ws5);
		
		Equipment ws6 = new Equipment();
		ws6.setBrand("Goya");
		ws6.setModel("Guru X");
		ws6.setCategory(CategoryType.WINDSURF);
		ws6.setSize("4.7");
		ws6.setDescription("Built, designed and redesigned by Jason Diffin year after year over the past three decades, since the early 90’s to be precise, the Guru X is also the longest running sail in the Goya Windsurfing range.");
		ws6.setPrice(21.0);
		ws6.setImg("https://d2z2i12dpvcgkc.cloudfront.net/wp-content/uploads/2021/11/2022_Goya_Windsurfing_Guru_X_FPY@2x.jpg");
		equipmentService.createEquipment(ws6);
		
		Equipment ws7 = new Equipment();
		ws7.setBrand("Goya");
		ws7.setModel("Banzai X Pro");
		ws7.setCategory(CategoryType.WINDSURF);
		ws7.setSize("5.5");
		ws7.setDescription("The new Goya Windsurfing sails now come packed in recycled cardboard and paper tape only. No redundant plastic bags. We figured it’s a worthy trade off, as our love for windsurfing and the planet only grows.");
		ws7.setPrice(21.0);
		ws7.setImg("https://d2z2i12dpvcgkc.cloudfront.net/wp-content/uploads/2021/11/2022_Goya_Windsurfing_Banzai_X_Pro_BBY@2x.jpg");
		equipmentService.createEquipment(ws7);
		
		Equipment ws8 = new Equipment();
		ws8.setBrand("Goya");
		ws8.setModel("Custom 4 Pro");
		ws8.setCategory(CategoryType.WINDSURF);
		ws8.setSize("87");
		ws8.setDescription("The latest Custom 4 Pro from our world champions. The Custom 4 Pro is the ultimate Pro Model custom wave board, as it is not just the shape but the same off-the-shelf board our team chooses to ride and compete on.");
		ws8.setPrice(21.0);
		ws8.setImg("https://d2z2i12dpvcgkc.cloudfront.net/wp-content/uploads/2022/02/2022_Goya_Windsurfing_Custom_4_Pro_rev2@2x.jpg");
		equipmentService.createEquipment(ws8);
		
		Equipment ws9 = new Equipment();
		ws9.setBrand("Fanatic");
		ws9.setModel("Freewave TE");
		ws9.setCategory(CategoryType.WINDSURF);
		ws9.setSize("85");
		ws9.setDescription("An evolution of the Stubby outline blended with our legendary FreeWave DNA, the FreeWave TE is a true chameleon – ready to adapt and excel in all conditions.");
		ws9.setPrice(21.0);
		ws9.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6322/e30a/438a/5100/e070/07e8/medium/F23_FreeWaveTE_2500.png?1663230701");
		equipmentService.createEquipment(ws9);
		
		Equipment ws10 = new Equipment();
		ws10.setBrand("Fanatic");
		ws10.setModel("Freewave TE");
		ws10.setCategory(CategoryType.WINDSURF);
		ws10.setSize("95");
		ws10.setDescription("An evolution of the Stubby outline blended with our legendary FreeWave DNA, the FreeWave TE is a true chameleon – ready to adapt and excel in all conditions.");
		ws10.setPrice(21.0);
		ws10.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6322/e30a/438a/5100/e070/07e8/medium/F23_FreeWaveTE_2500.png?1663230701");
		equipmentService.createEquipment(ws10);
	}
	
	// Insert wakeboard equipment on DB
	public void insertWakeboardEquipment () {
		
		Equipment wb1 = new Equipment();
		wb1.setBrand("Slingshot");
		wb1.setModel("2023 JOHNNY ROCKET");
		wb1.setCategory(CategoryType.WAKEBOARD);
		wb1.setSize("151");
		wb1.setDescription("The Johnny Rocket is an all-new all-terrain board built for one of the most daring wakeboarders we've ever worked with: John Dreiling.");
		wb1.setPrice(28.0);
		wb1.setImg("https://cdn.shopify.com/s/files/1/0508/8093/8184/products/2023-johnny-rocket-151-slingshot-sports-988403_1800x1800.jpg?v=1666374443");
		equipmentService.createEquipment(wb1);
		
		Equipment wb2 = new Equipment();
		wb2.setBrand("Slingshot");
		wb2.setModel("2023 COALITION");
		wb2.setCategory(CategoryType.WAKEBOARD);
		wb2.setSize("149");
		wb2.setDescription("The Coalition is the gold standard of cable wakeboarding. It's got a magical combination of outline, tip shape, and rocker that delivers endless amounts of entertainment in the park—no matter your riding style.");
		wb2.setPrice(28.0);
		wb2.setImg("https://cdn.shopify.com/s/files/1/0508/8093/8184/products/2023-coalition-slingshot-sports-242505_1800x1800.jpg?v=1666375572");
		equipmentService.createEquipment(wb2);
		
		Equipment wb3 = new Equipment();
		wb3.setBrand("Slingshot");
		wb3.setModel("2023 SALMON");
		wb3.setCategory(CategoryType.WAKEBOARD);
		wb3.setSize("155");
		wb3.setDescription("The Salmon is a special signature edition of our Nomad board, designed exclusively for wake-park ripper Victor Salmon. Victor fell in love with the Nomad's outline, length and rocker profile.");
		wb3.setPrice(28.0);
		wb3.setImg("https://cdn.shopify.com/s/files/1/0508/8093/8184/products/2023-salmon-155-slingshot-sports-483464_1800x1800.jpg?v=1666372549");
		equipmentService.createEquipment(wb3);
		
		Equipment wb4 = new Equipment();
		wb4.setBrand("Slingshot");
		wb4.setModel("2023 COPYCAT");
		wb4.setCategory(CategoryType.WAKEBOARD);
		wb4.setSize("39-42");
		wb4.setDescription("The Space Mob boots are the chosen boots of the best cable wakeboarders in the world. They're the original two-piece cable-specific boots built to protect your feet while walking the shores and secure your feet while cruising through the park.");
		wb4.setPrice(11.0);
		wb4.setImg("https://cdn.shopify.com/s/files/1/0508/8093/8184/products/2023-salmon-155-slingshot-sports-483464_1800x1800.jpg?v=1666372549");
		equipmentService.createEquipment(wb4);
		
		Equipment wb5 = new Equipment();
		wb5.setBrand("Slingshot");
		wb5.setModel("2023 SPACE MOB");
		wb5.setCategory(CategoryType.WAKEBOARD);
		wb5.setSize("43-45");
		wb5.setDescription("A female-specific, high-performance park boot with customized flex and styling options, removable liners, and the stamp of approval from the fastest growing female-riders movement around the world: the Copycats Club.");
		wb5.setPrice(11.0);
		wb5.setImg("https://cdn.shopify.com/s/files/1/0508/8093/8184/products/2023-copycat-slingshot-sports-672310_720x.jpg?v=1666375812");
		equipmentService.createEquipment(wb5);
		
		Equipment wb6 = new Equipment();
		wb6.setBrand("Slingshot");
		wb6.setModel("2023 SPACE MOB");
		wb6.setCategory(CategoryType.WAKEBOARD);
		wb6.setSize("40-42");
		wb6.setDescription("The Space Mob boots are the chosen boots of the best cable wakeboarders in the world. They're the original two-piece cable-specific boots built to protect your feet while walking the shores and secure your feet while cruising through the park.");
		wb6.setPrice(11.0);
		wb6.setImg("https://cdn.shopify.com/s/files/1/0508/8093/8184/products/2023-salmon-155-slingshot-sports-483464_1800x1800.jpg?v=1666372549");
		equipmentService.createEquipment(wb6);
		
		Equipment wb7 = new Equipment();
		wb7.setBrand("Liquid Force");
		wb7.setModel("2023 TAO");
		wb7.setCategory(CategoryType.WAKEBOARD);
		wb7.setSize("150");
		wb7.setDescription("Anyone who has seen Daniel ride knows his board needs to take a beating! The all wood CNC'd core, grind base and liquid rials allow for just that. The 2023 TAO comes with the new 4-Up Flex Bar for added flex and a narrower stance option.");
		wb7.setPrice(28.0);
		wb7.setImg("https://images-us-prod.cms.commerce.dynamics.com/cms/api/nwtfklkdlc/imageFileData/search?fileName=/Products%2FLF2235028_000_001.png&fallback=/Products/LF2235028_000_001.png&m=6&q=80&cropfocalregion=true");
		equipmentService.createEquipment(wb7);
		
		Equipment wb8 = new Equipment();
		wb8.setBrand("Liquid Force");
		wb8.setModel("2023 PEAK");
		wb8.setCategory(CategoryType.WAKEBOARD);
		wb8.setSize("149");
		wb8.setDescription("Nico needs no introduction nor does the Peak, our most popular park board for 10 years and counting. Now featuring our new eco-friendly PET green foam core. We removed the wood in the tip and tail to reduce swing weight and increase tip and tail flex.");
		wb8.setPrice(28.0);
		wb8.setImg("https://images-us-prod.cms.commerce.dynamics.com/cms/api/nwtfklkdlc/imageFileData/search?fileName=/Products%2FLF2235006_000_001.png&fallback=/Products/LF2235006_000_001.png&m=6&q=80&cropfocalregion=true");
		equipmentService.createEquipment(wb8);
		
		Equipment wb9 = new Equipment();
		wb9.setBrand("Liquid Force");
		wb9.setModel("2023 HOOK 4D");
		wb9.setCategory(CategoryType.WAKEBOARD);
		wb9.setSize("37-43");
		wb9.setDescription("Felix is constantly changing how we view cable and winching with his unique and powerful style...and the Hook 4D is his weapon of choice. Its 3-Zone Velcro Closure allows you to cinch things down to fit the needs of whatever spot you're sessioning.");
		wb9.setPrice(12.0);
		wb9.setImg("https://images-us-prod.cms.commerce.dynamics.com/cms/api/nwtfklkdlc/imageFileData/search?fileName=/Products%2FLF2235214_000_001.png&fallback=/Products/LF2235214_000_001.png&m=6&q=80&cropfocalregion=true");
		equipmentService.createEquipment(wb9);
		
		Equipment wb10 = new Equipment();
		wb10.setBrand("Liquid Force");
		wb10.setModel("2023 PEAK 6X");
		wb10.setCategory(CategoryType.WAKEBOARD);
		wb10.setSize("39-47");
		wb10.setDescription("Loaded with all the same great features of its 4D counterpart, the Peak 6X packs a serious punch for any rider out there. Whether you are hitting the park or taking a set behind the boat, the Peak 6X is your binding!");
		wb10.setPrice(12.0);
		wb10.setImg("https://images-us-prod.cms.commerce.dynamics.com/cms/api/nwtfklkdlc/imageFileData/search?fileName=/Products%2FLF2235239_000_001.png&fallback=/Products/LF2235239_000_001.png&m=6&q=80&cropfocalregion=true");
		equipmentService.createEquipment(wb10);
	}
}
