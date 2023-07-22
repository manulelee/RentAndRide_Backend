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
		sb1.setModel("Rocket Wide");
		sb1.setCategory(CategoryType.SURF);
		sb1.setSize("5'9″ 19 3/4″ 2 9/16″");
		sb1.setDescription("La Rocket Wide è una macchina da surf, ideale per chi vuole spaccare le onde del mediterraneo e non solo, progettata per aumentare il fattore divertimento quando le onde non sono delle migliori.");
		sb1.setPrice(35.0);
		sb1.setImg("https://www.liquido.it/cdn/shop/files/AlMerrickRocketWideWhiteLiquido_1024x1024.webp?v=1689084720");
		equipmentService.createEquipment(sb1);
		
		Equipment sb2 = new Equipment();
		sb2.setBrand("Channel Islands");
		sb2.setModel("Average Joe");
		sb2.setCategory(CategoryType.SURF);
		sb2.setSize("5’9″ x 22 3/8″ x 2 3/4″");
		sb2.setDescription("La Average Joe è una delle tavole di più di successo degli ultimi anni di Al Merrick molto apprezzata per la sua facilità di utilizzo in tante condizioni. Ha un tail largo per facilitare la partenza con le onde più mosce.");
		sb2.setPrice(35.0);
		sb2.setImg("https://www.liquido.it/cdn/shop/products/big_4104-channel-island-average-joe-59-tuflite-v-tech-fcsii_1024x1024.png?v=1645721743");
		equipmentService.createEquipment(sb2);
		
		Equipment sb3 = new Equipment();
		sb3.setBrand("Channel Islands");
		sb3.setModel("Ultra Joe");
		sb3.setCategory(CategoryType.SURF);
		sb3.setSize("5’7″ x 21 7/8″ x 2 5/8″");
		sb3.setDescription("La Utra Joe è l'evoluzione di una delle tavole più di successo degli ultimi anni, la sorella maggiore Average Joe molto apprezzata. Ha un tail più rastremato e un nose più stretto per aumentare la manovrabilità.");
		sb3.setPrice(35.0);
		sb3.setImg("https://www.liquido.it/cdn/shop/products/tavola-da-surf-channel-island-ultra-joe_d9ce76ac-2e33-4d3b-8fd9-3854b91e4a5d_1024x1024.jpg?v=1648718421");
		equipmentService.createEquipment(sb3);
		
		Equipment sb4 = new Equipment();
		sb4.setBrand("Channel Islands");
		sb4.setModel("Happy Everyday");
		sb4.setCategory(CategoryType.SURF);
		sb4.setSize("5’10″ x 19 3/4″ x 2 1/2″");
		sb4.setDescription("Creata da Britt Merrick da quello che inizialmente era il modello di shortboard performante Two Happy, la nuova Happy Everyday soddisfa un'esigenza di ogni surfista: per un surf quotidiano.");
		sb4.setPrice(35.0);
		sb4.setImg("https://www.liquido.it/cdn/shop/files/vergv.jpwgfregreg_1024x1024.jpg?v=1683993494");
		equipmentService.createEquipment(sb4);
		
		Equipment sb5 = new Equipment();
		sb5.setBrand("Lost");
		sb5.setModel("Rocket Redux");
		sb5.setCategory(CategoryType.SURF);
		sb5.setSize("5’10″ x 20″ x 2 1/2″");
		sb5.setDescription("La  Rocket Redux è una delle tavole più polivalenti create da Matt Biolos e molto apprezzata dal team Lost. L'ottima manovrabilità ti permetterà un surf aggressivo e i volumi ben distribuiti la rendono molto veloce anche nelle sezioni più lente.");
		sb5.setPrice(35.0);
		sb5.setImg("https://www.liquido.it/cdn/shop/products/tav.066_1024x1024.png?v=1648799123");
		equipmentService.createEquipment(sb5);
		
		Equipment sb6 = new Equipment();
		sb6.setBrand("Lost");
		sb6.setModel("Puddle Jumper HP");
		sb6.setCategory(CategoryType.SURF);
		sb6.setSize("5’7″ x 20 1/4″ x 2 1/2″");
		sb6.setDescription("La  Puddle Jumper HP è una tavola da onde medio piccole, molto polivalente e grazie ai volumi generosi facile nella pagaiata e nel prendere le onde. Ti permetterà fare un surf anche aggressivo e perfetta per le nostre onde italiane.");
		sb6.setPrice(35.0);
		sb6.setImg("https://www.liquido.it/cdn/shop/products/tav.303_1024x1024.png?v=1648799165");
		equipmentService.createEquipment(sb6);
		
		Equipment sb7 = new Equipment();
		sb7.setBrand("Hayden Shapes");
		sb7.setModel("Hypto Krypto");
		sb7.setCategory(CategoryType.SURF);
		sb7.setSize("5’10″ x 20 1/4″ x 2 5/8″");
		sb7.setDescription("Our best small wave, performance shortboard just got better! The SUB DRIVER 2.0 was derived to benefit the Pros, yet it really is perfect for most “Bros”.");
		sb7.setPrice(35.0);
		sb7.setImg("https://www.liquido.it/cdn/shop/files/HaydenshapesHyptoKrypto5_10WhiteRailBlack_2_1024x1024.webp?v=1689087934");
		equipmentService.createEquipment(sb7);
		
		Equipment sb8 = new Equipment();
		sb8.setBrand("Twins Bros");
		sb8.setModel("Freaky House");
		sb8.setCategory(CategoryType.SURF);
		sb8.setSize("5’6″ x 21 1/4″ x 2 3/8″");
		sb8.setDescription("La Freaky House è uno dei modelli più venduti di Twins B. è stato sviluppato per tutti i surfers che cercano una tavola per le condizioni di onda estremamente piccola ma al tempo stesso vogliono una tavola divertente.");
		sb8.setPrice(35.0);
		sb8.setImg("https://www.liquido.it/cdn/shop/files/TwinbrosFreakyHouse5.6WhiteLiquido_1024x1024.webp?v=1683643235");
		equipmentService.createEquipment(sb8);
		
		Equipment sb9 = new Equipment();
		sb9.setBrand("Pukas");
		sb9.setModel("Hyper-Link");
		sb9.setCategory(CategoryType.SURF);
		sb9.setSize("6’0″ x 20 1/2″ x 2 1/2″");
		sb9.setDescription("La Hyperlink  è l'ultima nata in casa Pukas Surfboards dalla collaborazione di Mayhem. L'ottima manovrabilità ti permetterà un surf aggressivo e i volumi ben distribuiti la rendono veloce anche nelle sezioni più lente.");
		sb9.setPrice(35.0);
		sb9.setImg("https://www.liquido.it/cdn/shop/products/CM_Photogrid_1677923803635_1024x1024.jpg?v=1677923929");
		equipmentService.createEquipment(sb9);
		
		Equipment sb10 = new Equipment();
		sb10.setBrand("Indio");
		sb10.setModel("Trim Machine");
		sb10.setCategory(CategoryType.SURF);
		sb10.setSize("9’1″ x 21 7/8″ x 2 7/8″");
		sb10.setDescription("Il Trim Machine  è stata progettata per essere il classico longboard single fin, ottima per fare cross-stepping, con un profondo concavo sotto il nose, questa tavola sarà sempre pronta ad ogni situazione.");
		sb10.setPrice(40.0);
		sb10.setImg("https://www.liquido.it/cdn/shop/products/vdvdvdsvd_1024x1024.jpg?v=1653747857");
		equipmentService.createEquipment(sb10);
		
		Equipment sb11 = new Equipment();
		sb11.setBrand("FireWire");
		sb11.setModel("Special T");
		sb11.setCategory(CategoryType.SURF);
		sb11.setSize("9’3″ x 22 3/4″ x 3″");
		sb11.setDescription("La Special T di Firewire shapata da Dan Mann in collaborazione con Taylor Jensen, è uno dei modelli firewire voluti dal longboarder campione del mondo per avere in casa anche una tavola più adatta al longboard tradizionale.");
		sb11.setPrice(40.0);
		sb11.setImg("https://www.liquido.it/cdn/shop/products/TJ_Special_T_TT_540x_a2ecbae6-ef75-4ce3-b631-8bec5d23360e_1024x1024.jpg?v=1632846585");
		equipmentService.createEquipment(sb11);
		
		Equipment sb12 = new Equipment();
		sb12.setBrand("Bear");
		sb12.setModel("Wombat");
		sb12.setCategory(CategoryType.SURF);
		sb12.setSize("6’4″ x 21 1/2″ x 2 5/8″");
		sb12.setDescription("Il Wombat è il leggendario modello di tavola da surf Bear più veduta da fine anni '90 ad oggi. Uno dei suoi punti di forza è la versatilità, rendendola adatta ai surfisti di ogni livello.");
		sb12.setPrice(40.0);
		sb12.setImg("https://www.liquido.it/cdn/shop/products/Bear-SurfWombatVerdeZaffiro6_4__7_1024x1024.png?v=1653125397");
		equipmentService.createEquipment(sb12);
	}
	
	// Insert kitesurf equipment on DB
	public void insertKitesurfEquipment () {
		
		Equipment ks1 = new Equipment();
		ks1.setBrand("Duotone");
		ks1.setModel("Neo SLS");
		ks1.setCategory(CategoryType.KITESURF);
		ks1.setSize("9 m²");
		ks1.setDescription("Il miglior kite wave sul mercato diventa SLS. Più forte, più leggero e superiore, con un'incredibile deriva, una virata dinamica e una vasta gamma, il Neo SLS è l'unico kite da portare sull'acqua se usi una tavola da surf.");
		ks1.setPrice(27.0);
		ks1.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62c5/6086/cc9d/9200/d167/125c/xlarge/NEO23_SLS_CC04.png?1657102436");
		equipmentService.createEquipment(ks1);
		
		Equipment ks2 = new Equipment();
		ks2.setBrand("Duotone");
		ks2.setModel("Neo SLS");
		ks2.setCategory(CategoryType.KITESURF);
		ks2.setSize("11 m²");
		ks2.setDescription("Il miglior kite wave sul mercato diventa SLS. Più forte, più leggero e superiore, con un'incredibile deriva, una virata dinamica e una vasta gamma, il Neo SLS è l'unico kite da portare sull'acqua se usi una tavola da surf.");
		ks2.setPrice(27.0);
		ks2.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62c5/6085/cc9d/9200/bd67/13d0/xlarge/NEO23_SLS_CC03.png?1657102436");
		equipmentService.createEquipment(ks2);
		
		Equipment ks3 = new Equipment();
		ks3.setBrand("Duotone");
		ks3.setModel("Neo SLS");
		ks3.setCategory(CategoryType.KITESURF);
		ks3.setSize("13 m²");
		ks3.setDescription("Il miglior kite wave sul mercato diventa SLS. Più forte, più leggero e superiore, con un'incredibile deriva, una virata dinamica e una vasta gamma, il Neo SLS è l'unico kite da portare sull'acqua se usi una tavola da surf.");
		ks3.setPrice(27.0);
		ks3.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62c5/6086/cc9d/9200/d167/125c/xlarge/NEO23_SLS_CC04.png?1657102436");
		equipmentService.createEquipment(ks3);
		
		Equipment ks11 = new Equipment();
		ks11.setBrand("Duotone");
		ks11.setModel("Gonzales");
		ks11.setCategory(CategoryType.KITESURF);
		ks11.setSize("138 cm");
		ks11.setDescription("Inizia bene il tuo viaggio nel kiteboarding, rendi ogni nuovo trick più facile da imparare, migliora la tua guida più velocemente e fai in modo che ogni session conti!");
		ks11.setPrice(13.0);
		ks11.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6315/d4c0/f91b/4200/cda8/fc62/xlarge/GONZALES23_%281%29.png?1662375075");
		equipmentService.createEquipment(ks11);
		
		Equipment ks12 = new Equipment();
		ks12.setBrand("Duotone");
		ks12.setModel("Jamie SLS");
		ks12.setCategory(CategoryType.KITESURF);
		ks12.setSize("136 cm");
		ks12.setDescription("La Jaime SLS è perfetta per i rider a cui piace buttare giù trick freestyle originali e amano andare in giro, ma alla fine vogliono le prestazioni necessarie per ottenere il record di salto più alto in classifica nel loro homespot.");
		ks12.setPrice(13.0);
		ks12.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62c5/6bf0/cc9d/9200/bd67/1b16/xlarge/JAMIE23_SLS2.png?1657105358");
		equipmentService.createEquipment(ks12);
		
		Equipment ks4 = new Equipment();
		ks4.setBrand("Duotone");
		ks4.setModel("Evo SLS");
		ks4.setCategory(CategoryType.KITESURF);
		ks4.setSize("10 m²");
		ks4.setDescription("Il kite all-round con le migliori prestazioni della linea Duotone! L'Evo SLS è estremamente adatto per freeride, big air, hooked freestyle e, con la costruzione SLS, offre un'esperienza di volo dinamica senza pari.");
		ks4.setPrice(27.0);
		ks4.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/630c/cce4/c5b4/8600/e5c6/8df2/xlarge/EVO23_SLS_C08_%281%29.png?1661783234");
		equipmentService.createEquipment(ks4);
		
		Equipment ks5 = new Equipment();
		ks5.setBrand("Duotone");
		ks5.setModel("Evo SLS");
		ks5.setCategory(CategoryType.KITESURF);
		ks5.setSize("12 m²");
		ks5.setDescription("Il kite all-round con le migliori prestazioni della linea Duotone! L'Evo SLS è estremamente adatto per freeride, big air, hooked freestyle e, con la costruzione SLS, offre un'esperienza di volo dinamica senza pari.");
		ks5.setPrice(27.0);
		ks5.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/630c/cce5/c5b4/8600/bdc6/95ed/xlarge/EVO23_SLS_C07_%281%29.png?1661783233");
		equipmentService.createEquipment(ks5);
		
		Equipment ks6 = new Equipment();
		ks6.setBrand("Duotone");
		ks6.setModel("Evo SLS");
		ks6.setCategory(CategoryType.KITESURF);
		ks6.setSize("13 m²");
		ks6.setDescription("Il kite all-round con le migliori prestazioni della linea Duotone! L'Evo SLS è estremamente adatto per freeride, big air, hooked freestyle e, con la costruzione SLS, offre un'esperienza di volo dinamica senza pari.");
		ks6.setPrice(27.0);
		ks6.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/630c/cce4/c5b4/8600/d1c6/8e3b/xsmall/EVO23_SLS_C10_%281%29.png?1661783233");
		equipmentService.createEquipment(ks6);
		
		Equipment ks7 = new Equipment();
		ks7.setBrand("Duotone");
		ks7.setModel("Team Series");
		ks7.setCategory(CategoryType.KITESURF);
		ks7.setSize("140 cm");
		ks7.setDescription("La TS SLS prende la leggendaria Team Series e le conferisce un restyling con una costruzione SLS. Questo è l'apice del Freestyle e del riding in una nuova forma fantastica per il 2023. Se pratichi Freestyle e vuoi il meglio è la tavola adatta a te..");
		ks7.setPrice(13.0);
		ks7.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62c5/6e59/cc9d/9200/d167/1270/xlarge/TS23_SLS.png?1657105974");
		equipmentService.createEquipment(ks7);
		
		Equipment ks8 = new Equipment();
		ks8.setBrand("Duotone");
		ks8.setModel("Pace");
		ks8.setCategory(CategoryType.KITESURF);
		ks8.setSize("4'6″");
		ks8.setDescription("La Pace SLS è la tavola che soddisfa il tuo bisogno di velocità durante il freeride, sfondando gli ultimi trick freestyle. Una tavola in carbonio superleggera, appositamente progettata per essere veloce e controllabile, in acqua e in aria.");
		ks8.setPrice(20.0);
		ks8.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/60d0/43ff/ca27/c400/a88e/239c/xlarge/PACE22_SLS.png?1624261617");
		equipmentService.createEquipment(ks8);
		
		Equipment ks9 = new Equipment();
		ks9.setBrand("Duotone");
		ks9.setModel("Whip");
		ks9.setCategory(CategoryType.KITESURF);
		ks9.setSize("5'2″");
		ks9.setDescription("Perfetta in onde di piccole e medie dimensioni, la Whip è la tavola da usare quando vuoi ottenere la verticalità in tasca e tirare fuori gli ultimi trick. La forma compatta e le rotaie parallele offrono molta spinta durante le curve.");
		ks9.setPrice(13.0);
		ks9.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/638e/f978/f9e0/e000/ccc3/c8e5/xlarge/WHIP23_CSC.png?1670314329");
		equipmentService.createEquipment(ks9);
		
		Equipment ks10 = new Equipment();
		ks10.setBrand("Duotone");
		ks10.setModel("Wam SLS");
		ks10.setCategory(CategoryType.KITESURF);
		ks10.setSize("5'7″");
		ks10.setDescription("La migliore tavola della gamma per condizioni variabili. Può gestire onde di quasi tutte le dimensioni e sfruttare al massimo ogni sessione, indipendentemente dall'angolo del vento o dalla potenza delle onde.");
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
		ws1.setSize("4.0 m²");
		ws1.setDescription("L'IDOL può fare tutto ciò di cui un freestyler ha bisogno. Oltre alla sua maneggevolezza assolutamente neutra, non dà feedback indesiderati ed è incredibilmente leggera nelle tue mani, lasciandoti libero di concentrarti sui tuoi movimenti e manovre.");
		ws1.setPrice(21.0);
		ws1.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/628f/56cd/4e2a/4b00/a855/520a/xlarge/DTW23_Idol_LTD_Rendering_C10_Web72_.png?1653561015");
		equipmentService.createEquipment(ws1);

		Equipment ws5 = new Equipment();
		ws5.setBrand("Duotone");
		ws5.setModel("Super Stars SLS");
		ws5.setCategory(CategoryType.WINDSURF);
		ws5.setSize("4.2 m²");
		ws5.setDescription("Ridotto all'essenziale, ultraleggero eppure resistente: con SUPER STAR stiamo realizzando il nostro sogno dell'ultima vela wave ultra diretta con tecnologia all'avanguardia. Incredibile maneggevolezza ma nessun sacrificio in termini di durata e longevità");
		ws5.setPrice(21.0);
		ws5.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6294/6f5f/4e2a/4b00/a855/5227/xlarge/DTW23_Super_Star_SLS_Rendering_Web72_final.png?1653894985");
		equipmentService.createEquipment(ws5);
		
		Equipment ws3 = new Equipment();
		ws3.setBrand("Duotone");
		ws3.setModel("Super Hero SLS");
		ws3.setCategory(CategoryType.WINDSURF);
		ws3.setSize("4.7 m²");
		ws3.setDescription("Abbiamo dedicato 4 anni di puro sviluppo a questa vela. La SUPER HERO SLS ti dà la libertà di girare con il tuo stile. Un collegamento diretto alla tua vela, grazie alla reazione riflessa fulminea della nostra nuova tecnologia di fusione.");
		ws3.setPrice(21.0);
		ws3.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6304/e6e8/c5b4/8600/bdc6/8c79/xlarge/DTW23_SuperHERO_SLS_web72_final.png?1661265618");
		equipmentService.createEquipment(ws3);
		
		Equipment ws6 = new Equipment();
		ws6.setBrand("Duotone");
		ws6.setModel("Duke");
		ws6.setCategory(CategoryType.WINDSURF);
		ws6.setSize("4.7 m²");
		ws6.setDescription("La nostra vela più famosa di sempre è tornata! Combinata con la costruzione SLS e tutti gli altri concetti di costruzione sviluppati negli ultimi decenni, la reincarnazione del duke è destinata a essere il nuovo punto di riferimento per le vele.");
		ws6.setPrice(21.0);
		ws6.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/628f/559e/4e2a/4b00/a855/5201/xlarge/DTW23_Duke_Rendering_C18_Web72_final.png?1653560711");
		equipmentService.createEquipment(ws6);
		
		Equipment ws2 = new Equipment();
		ws2.setBrand("Duotone");
		ws2.setModel("Idol");
		ws2.setCategory(CategoryType.WINDSURF);
		ws2.setSize("5.0 m²");
		ws2.setDescription("L'IDOL può fare tutto ciò di cui un freestyler ha bisogno. Oltre alla sua maneggevolezza assolutamente neutra, non dà feedback indesiderati ed è incredibilmente leggera nelle tue mani, lasciandoti libero di concentrarti sui tuoi movimenti e manovre.");
		ws2.setPrice(21.0);
		ws2.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/628f/56cd/4e2a/4b00/a855/520a/xlarge/DTW23_Idol_LTD_Rendering_C10_Web72_.png?1653561015");
		equipmentService.createEquipment(ws2);
		
		Equipment ws4 = new Equipment();
		ws4.setBrand("Duotone");
		ws4.setModel("Super Hero SLS");
		ws4.setCategory(CategoryType.WINDSURF);
		ws4.setSize("5.3 m²");
		ws4.setDescription("Abbiamo dedicato 4 anni di puro sviluppo a questa vela. La SUPER HERO SLS ti dà la libertà di girare con il tuo stile. Un collegamento diretto alla tua vela, grazie alla reazione riflessa fulminea della nostra nuova tecnologia di fusione.");
		ws4.setPrice(21.0);
		ws4.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6304/e6e8/c5b4/8600/bdc6/8c79/xlarge/DTW23_SuperHERO_SLS_web72_final.png?1661265618");
		equipmentService.createEquipment(ws4);
		
		Equipment ws7 = new Equipment();
		ws7.setBrand("Duotone");
		ws7.setModel("Duke");
		ws7.setCategory(CategoryType.WINDSURF);
		ws7.setSize("5.3 m²");
		ws7.setDescription("La nostra vela più famosa di sempre è tornata! Combinata con la costruzione SLS e tutti gli altri concetti di costruzione sviluppati negli ultimi decenni, la reincarnazione del duke è destinata a essere il nuovo punto di riferimento per le vele.");
		ws7.setPrice(21.0);
		ws7.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/62cd/14e3/5ef8/ea00/bd0b/f916/xlarge/DTW23_Duke_Rendering_C20_Web_72.png?1657607373");
		equipmentService.createEquipment(ws7);
		
		Equipment ws8 = new Equipment();
		ws8.setBrand("Fanatic");
		ws8.setModel("Grip XS");
		ws8.setCategory(CategoryType.WINDSURF);
		ws8.setSize("68 lts");
		ws8.setDescription("La Grip XS è la nostra tavola wave ad alte prestazioni dedicata alle future stelle del nostro sport. Progettato per i rider leggeri, ogni dettaglio è costruito in proporzione in modo che chiunque possa liberare il proprio  potenziale senza limitazioni. ");
		ws8.setPrice(21.0);
		ws8.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6322/e384/438a/5100/cc70/0fc4/medium/F23_GripXS_2500.png?1663230827");
		equipmentService.createEquipment(ws8);
		
		Equipment ws9 = new Equipment();
		ws9.setBrand("Fanatic");
		ws9.setModel("Freewave TE");
		ws9.setCategory(CategoryType.WINDSURF);
		ws9.setSize("85 lts");
		ws9.setDescription("Un'evoluzione del profilo Stubby mescolato con il nostro leggendario DNA FreeWave, il FreeWave TE è un vero camaleonte, pronto ad adattarsi ed eccellere in tutte le condizioni.");
		ws9.setPrice(21.0);
		ws9.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6322/e30a/438a/5100/e070/07e8/medium/F23_FreeWaveTE_2500.png?1663230701");
		equipmentService.createEquipment(ws9);
		
		Equipment ws10 = new Equipment();
		ws10.setBrand("Fanatic");
		ws10.setModel("Freewave TXTR");
		ws10.setCategory(CategoryType.WINDSURF);
		ws10.setSize("95");
		ws10.setDescription("Un'evoluzione del profilo Stubby mescolato con il nostro leggendario DNA FreeWave, il FreeWave TXTR è un vero camaleonte, pronto ad adattarsi ed eccellere in tutte le condizioni.");
		ws10.setPrice(21.0);
		ws10.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6322/e31c/438a/5100/cc70/0fc2/medium/F23_FreeWaveTXTR_2500.png?1663230720");
		equipmentService.createEquipment(ws10);
	
		Equipment ws11 = new Equipment();
		ws11.setBrand("Fanatic");
		ws11.setModel("Mamba TE");
		ws11.setCategory(CategoryType.WINDSURF);
		ws11.setSize("78");
		ws11.setDescription("Il Mamba TE è un'evoluzione dello Stubby con attributi simili nelle onde sgonfie, ma offre prestazioni migliorate per quando le condizioni si accendono. Il nostro team ha evoluto la forma originale verso un profilo con sezioni nose e tail più tirate.");
		ws11.setPrice(21.0);
		ws11.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6322/e39c/438a/5100/e070/07e9/medium/F23_MambaTE_2500.png?1663230849");
		equipmentService.createEquipment(ws11);
		
		Equipment ws12 = new Equipment();
		ws12.setBrand("Fanatic");
		ws12.setModel("Skate TE");
		ws12.setCategory(CategoryType.WINDSURF);
		ws12.setSize("91");
		ws12.setDescription("Con una lunghezza compatta di soli 216 cm e una forma della coda finemente sintonizzata per un'accelerazione più rapida e una reazione più vivace e rapida, la nuova versione 91l è la tavola da freestyle più compatta e radicale che abbiamo mai realizzato.");
		ws12.setPrice(21.0);
		ws12.setImg("https://cdn.boards-and-more.com/system/product_picture_gallery_pictures/files/6322/e3b7/438a/5100/cc70/0fc5/medium/F23_SkateTE_2500.png?1663230876");
		equipmentService.createEquipment(ws12);
	
}
	
	// Insert wakeboard equipment on DB
	public void insertWakeboardEquipment () {
		
		Equipment wb1 = new Equipment();
		wb1.setBrand("Slingshot");
		wb1.setModel("2023 Jhonny Rocket");
		wb1.setCategory(CategoryType.WAKEBOARD);
		wb1.setSize("151 cm");
		wb1.setDescription("La Johnny Rocket è una nuovissima tavola all-terrain costruita per uno dei wakeboarder più audaci con cui abbiamo mai lavorato: John Dreiling.");
		wb1.setPrice(28.0);
		wb1.setImg("https://cdn.shopify.com/s/files/1/0508/8093/8184/products/2023-johnny-rocket-151-slingshot-sports-988403_1800x1800.jpg?v=1666374443");
		equipmentService.createEquipment(wb1);
		
		Equipment wb2 = new Equipment();
		wb2.setBrand("Slingshot");
		wb2.setModel("2023 The Coalition");
		wb2.setCategory(CategoryType.WAKEBOARD);
		wb2.setSize("149 cm");
		wb2.setDescription("The Coalition è il gold standard del cable-wakeboard. Ha una combinazione magica di profilo, forma della punta e rocker che offre infinite quantità di divertimento nel parco, indipendentemente dal tuo stile.");
		wb2.setPrice(28.0);
		wb2.setImg("https://cdn.shopify.com/s/files/1/0508/8093/8184/products/2023-coalition-slingshot-sports-242505_1800x1800.jpg?v=1666375572");
		equipmentService.createEquipment(wb2);
		
		Equipment wb5 = new Equipment();
		wb5.setBrand("Slingshot");
		wb5.setModel("2023 Copycat");
		wb5.setCategory(CategoryType.WAKEBOARD);
		wb5.setSize("43-45");
		wb5.setDescription("Uno stivale da park ad alte prestazioni specifico per donna con opzioni di stile e flessibilità personalizzate, scarpette rimovibili e il marchio di approvazione del movimento di riders in più rapida crescita in tutto il mondo: il Copycats Club.");
		wb5.setPrice(11.0);
		wb5.setImg("https://cdn.shopify.com/s/files/1/0508/8093/8184/products/2023-copycat-slingshot-sports-672310_720x.jpg?v=1666375812");
		equipmentService.createEquipment(wb5);
		
		Equipment wb4 = new Equipment();
		wb4.setBrand("Slingshot");
		wb4.setModel("2023 Space MOB");
		wb4.setCategory(CategoryType.WAKEBOARD);
		wb4.setSize("39-42");
		wb4.setDescription("Gli scarponi Space Mob sono gli scarponi scelti dai migliori cable wakeboarder del mondo. Sono gli originali stivali in due pezzi specifici per i cavi costruiti per proteggere i tuoi piedi mentre cammini sulla riva e per proteggerli mentre giri nel park.");
		wb4.setPrice(11.0);
		wb4.setImg("https://slingshotsports.com/cdn/shop/products/2023-space-mob-slingshot-sports-937414_1800x1800.jpg?v=1666371152");
		equipmentService.createEquipment(wb4);
		
		Equipment wb3 = new Equipment();
		wb3.setBrand("Slingshot");
		wb3.setModel("2023 Salmon");
		wb3.setCategory(CategoryType.WAKEBOARD);
		wb3.setSize("155 cm");
		wb3.setDescription("Salmon è un'edizione speciale firmata della nostra tavola Nomad, progettata esclusivamente per Victor Salmon, ripper del wake-park. Victor si innamorò del profilo, della lunghezza e del profilo rocker del Nomad.");
		wb3.setPrice(28.0);
		wb3.setImg("https://cdn.shopify.com/s/files/1/0508/8093/8184/products/2023-salmon-155-slingshot-sports-483464_1800x1800.jpg?v=1666372549");
		equipmentService.createEquipment(wb3);
		
		Equipment wb6 = new Equipment();
		wb6.setBrand("Slingshot");
		wb6.setModel("2023 Spabe MOB");
		wb6.setCategory(CategoryType.WAKEBOARD);
		wb6.setSize("40-42");
		wb6.setDescription("Gli scarponi Space Mob sono gli scarponi scelti dai migliori cable wakeboarder del mondo. Sono gli originali stivali in due pezzi specifici per i cavi costruiti per proteggere i tuoi piedi mentre cammini sulla riva e per proteggerli mentre giri nel park.");
		wb6.setPrice(11.0);
		wb6.setImg("https://slingshotsports.com/cdn/shop/products/2023-space-mob-slingshot-sports-937414_1800x1800.jpg?v=1666371152");
		equipmentService.createEquipment(wb6);
		
		Equipment wb7 = new Equipment();
		wb7.setBrand("Liquid Force");
		wb7.setModel("2022 TAO");
		wb7.setCategory(CategoryType.WAKEBOARD);
		wb7.setSize("150 cm");
		wb7.setDescription("Migliora la tua guida e il tuo buongustaio interiore ordinando un TAO del 2022... caldo e fresco alla griglia! Meglio ancora, super dimensionato con il 160! Ora, vai a bruciare un po' di calorie facendo dei giri caldi nel tuo park locale!");
		wb7.setPrice(28.0);
		wb7.setImg("https://images-us-prod.cms.commerce.dynamics.com/cms/api/nwtfklkdlc/imageFileData/search?fileName=/Products%2FLF2225000_000_001.png&fallback=/Products/LF2225000_000_001.png&m=6&q=80&cropfocalregion=true");
		equipmentService.createEquipment(wb7);
		
		Equipment wb9 = new Equipment();
		wb9.setBrand("Liquid Force");
		wb9.setModel("2023 HOOK 4D");
		wb9.setCategory(CategoryType.WAKEBOARD);
		wb9.setSize("37-43");
		wb9.setDescription("Cambia il modo in cui vediamo il cable-wakeboard con il suo stile unico e potente e l'Hook 4D sarà la tua arma preferita. La sua chiusura in velcro a 3 zone ti consente di stringere le cose per soddisfare le esigenze di qualsiasi punto tu stia sessione.");
		wb9.setPrice(12.0);
		wb9.setImg("https://images-us-prod.cms.commerce.dynamics.com/cms/api/nwtfklkdlc/imageFileData/search?fileName=/Products%2FLF2235214_000_001.png&fallback=/Products/LF2235214_000_001.png&m=6&q=80&cropfocalregion=true");
		equipmentService.createEquipment(wb9);
		
		Equipment wb8 = new Equipment();
		wb8.setBrand("Liquid Force");
		wb8.setModel("2023 PEAK");
		wb8.setCategory(CategoryType.WAKEBOARD);
		wb8.setSize("149 cm");
		wb8.setDescription("La Peak non ha bisogno di presentazioni, la nostra tavola da park più popolare da 10 anni e oltre. Ora con il nostro nuovo nucleo in schiuma verde PET ecologico. Abbiamo rimosso il legno per ridurre il peso dell'oscillazione e aumentare la flessibilità.");
		wb8.setPrice(28.0);
		wb8.setImg("https://images-us-prod.cms.commerce.dynamics.com/cms/api/nwtfklkdlc/imageFileData/search?fileName=/Products%2FLF2235006_000_001.png&fallback=/Products/LF2235006_000_001.png&m=6&q=80&cropfocalregion=true");
		equipmentService.createEquipment(wb8);
		
		Equipment wb10 = new Equipment();
		wb10.setBrand("Liquid Force");
		wb10.setModel("2023 PEAK 6X");
		wb10.setCategory(CategoryType.WAKEBOARD);
		wb10.setSize("39-47");
		wb10.setDescription("Caricato con tutte le stesse fantastiche caratteristiche della sua controparte 4D, il Peak 6X offre un pugno serio per qualsiasi ciclista là fuori. Sia che tu stia girando im parco o facendo una session dietro la barca, il Peak 6X è il tuo attacco!");
		wb10.setPrice(12.0);
		wb10.setImg("https://images-us-prod.cms.commerce.dynamics.com/cms/api/nwtfklkdlc/imageFileData/search?fileName=/Products%2FLF2235239_000_001.png&fallback=/Products/LF2235239_000_001.png&m=6&q=80&cropfocalregion=true");
		equipmentService.createEquipment(wb10);
		
		Equipment wb11 = new Equipment();
		wb11.setBrand("Slingshot");
		wb11.setModel("2023 KTV");
		wb11.setCategory(CategoryType.WAKEBOARD);
		wb11.setSize("43-46");
		wb11.setDescription("Gli stivali KTV sono la perfetta combinazione di prestazioni, semplicità e comfort. Il design easy-in, easy-out e senza problemi è a basso profilo, leggero e affidabile, consentendo ai rider di concentrarsi maggiormente sulla loro session");
		wb11.setPrice(28.0);
		wb11.setImg("https://slingshotsports.com/cdn/shop/products/2023-ktv-slingshot-sports-203691_1800x1800.jpg?v=1666375949");
		equipmentService.createEquipment(wb11);
		
		Equipment wb12 = new Equipment();
		wb12.setBrand("Slingshot");
		wb12.setModel("2023 Bearden");
		wb12.setCategory(CategoryType.WAKEBOARD);
		wb12.setSize("156 cm");
		wb12.setDescription("Il Bearden 156 è un'edizione speciale firmata del wakeboard Terrain, progettato per lo \"Space Grom\" preferito da tutti, Mr. Crosse Bearden.");
		wb12.setPrice(28.0);
		wb12.setImg("https://slingshotsports.com/cdn/shop/products/2023-bearden-156-slingshot-sports-320665_720x.jpg?v=1666371030");
		equipmentService.createEquipment(wb12);
	}
}