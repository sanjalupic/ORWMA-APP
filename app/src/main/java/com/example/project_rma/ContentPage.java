package com.example.project_rma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ContentPage extends AppCompatActivity implements ButtonExitFFromAboutListener{

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private ImageButton mInfoButton;
    private List<Books> listMyBooks;
    private List<Books> listAllBooks;

    public Books getBooks(int position){
        return listAllBooks.get(position);
    }
    public List<Books> getAllBooks(){
        return listAllBooks;
    }
    public List<Books> getMyBooks(){
        return listMyBooks;
    }
    public void addToMyBooks(int position){
        listMyBooks.add(listAllBooks.get(position));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentpage);

        initViews();
        setUpPager();
        setTabIcons();

        listAllBooks= new ArrayList<>();
        Books books1=null;
        books1=new Books("Pride and Prejudice", "Jane Austen", "romance",R.drawable.prideprejudice, "Pride and Prejudice is set in rural England in the early 19th century, and it follows the Bennet family, which includes five very different sisters. Mrs. Bennet is anxious to see all her daughters married, especially as the modest family estate is to be inherited by William Collins when Mr. Bennet dies. At a ball, the wealthy and newly arrived Charles Bingley takes an immediate interest in the eldest Bennet daughter, the beautiful and shy Jane. The encounter between his friend Darcy and Elizabeth is less cordial. Although Austen shows them intrigued by each other, she reverses the convention of first impressions: pride of rank and fortune and prejudice against the social inferiority of Elizabeth’s family hold Darcy aloof, while Elizabeth is equally fired both by the pride of self-respect and by prejudice against Darcy’s snobbery. The pompous Collins subsequently arrives, hoping to marry one of the Bennet sisters. Elizabeth, however, refuses his offer of marriage, and he instead becomes engaged to her friend Charlotte Lucas. During this time, Elizabeth encounters the charming George Wickham, a military officer. There is a mutual attraction between the two, and he informs her that Darcy has denied him his inheritance. After Bingley abruptly departs for London, Elizabeth’s dislike of Darcy increases as she becomes convinced that he is discouraging Bingley’s relationship with Jane. Darcy, however, has grown increasingly fond of Elizabeth, admiring her intelligence and vitality. While visiting the now-married Charlotte, Elizabeth sees Darcy, who professes his love for her and proposes. A surprised Elizabeth refuses his offer, and, when Darcy demands an explanation, she accuses him of breaking up Jane and Bingley. Darcy subsequently writes Elizabeth a letter in which he explains that he separated the couple largely because he did not believe Jane returned Bingley’s affection. He also discloses that Wickham, after squandering his inheritance, tried to marry Darcy’s then 15-year-old sister in an attempt to gain possession of her fortune. With these revelations, Elizabeth begins to see Darcy in a new light. Shortly thereafter the youngest Bennet sister, Lydia, elopes with Wickham. The news is met with great alarm by Elizabeth, since the scandalous affair—which is unlikely to end in marriage—could ruin the reputation of the other Bennet sisters. When she tells Darcy, he persuades Wickham to marry Lydia, offering him money. Despite Darcy’s attempt to keep his intervention a secret, Elizabeth learns of his actions. At the encouragement of Darcy, Bingley subsequently returns, and he and Jane become engaged. Finally, Darcy proposes again to Elizabeth, who this time accepts.");
        listAllBooks.add(books1);
        Books books2=null;
        books2=new  Books("Blue Lightning ", "Ann Cleeves", "memoirs",R.drawable.bluelightning, "Detective Jimmy Perez knows it will be a difficult homecoming when he returns to Fair Isle to introduce his fiancée, Fran, to his parents. It is a community where everyone knows each other, and strangers, while welcomed, are still viewed with a degree of mistrust. Challenging to live on at the best of times, with the autumn storms raging, the island feels cut off from the rest of the world. Trapped, tension is high and tempers become frayed. Enough to drive someone to murder. When a woman is body is discovered at the renowned Fair Isle bird observatory, with feathers threaded through her hair, the islanders react with fear and anger. With no support from the mainland and only Fran to help him, Jimmy has to investigate the old-fashioned way. He soon realises that this is no crime of passion - but a murder of cold and calculated intention. With no way off the island until the storms abate, Jimmy knows he has to work quickly. There is a killer on the island just waiting for the opportunity to strike again.");
        listAllBooks.add(books2);
        Books books3=null;
        books3=new  Books("Heartstone ", "C J Sansom", "crime",R.drawable.heartstone,  "Summer, 1545. England is at war, and Matthew Shardlake is about to encounter the most politically dangerous case of his career. While a massive French fleet prepares to attack, every able-bodied man is being pressed into military service. Meanwhile, an old servant of Queen Catherine Parr asks Shardlake to investigate claims of \"monstrous wrongs\" committed against a young ward of the court. Shardlake is inquiries take him and his loyal assistant, Jack Barak, to Hoyland Priory and Portsmouth, where the English fleet is gathering. There they uncover a startling link between the ward and a woman incarcerated in Bedlam. With a fantastic backdrop of wartime intrigue and a dramatic finale on board one of Henry VIII's great warships, Heartstone is certain to catapult this internationally bestselling series to greater prominence.");
        listAllBooks.add(books3);
        Books books4=null;
        books4=new  Books("It Ends With Us", "Colleeh Hoover", "romance",R.drawable.itendswithus,"Sometimes it is the one who loves you who hurts you the most. Lily hasn it always had it easy, but that is never stopped her from working hard for the life she wants. She is come a long way from the small town in Maine where she grew up—she graduated from college, moved to Boston, and started her own business. So when she feels a spark with a gorgeous neurosurgeon named Ryle Kincaid, everything in Lily is life suddenly seems almost too good to be true. Ryle is assertive, stubborn, maybe even a little arrogant. He is also sensitive, brilliant, and has a total soft spot for Lily. And the way he looks in scrubs certainly doesn it hurt. Lily can it get him out of her head. But Ryle is complete aversion to relationships is disturbing. Even as Lily finds herself becoming the exception to his \"no dating\" rule, she can't help but wonder what made him that way in the first place. As questions about her new relationship overwhelm her, so do thoughts of Atlas Corrigan—her first love and a link to the past she left behind. He was her kindred spirit, her protector. When Atlas suddenly reappears, everything Lily has built with Ryle is threatened. With this bold and deeply personal novel, Colleen Hoover delivers a heart-wrenching story that breaks exciting new ground for her as a writer. Combining a captivating romance with a cast of all-too-human characters, It Ends With Us is an unforgettable tale of love that comes at the ultimate price.");
        listAllBooks.add(books4);
        Books books5=null;
        books5=new  Books("The Frozen Dead ", "Bernard Minier", "crime",R.drawable.thefrozendead, "Saint-Martin-de-Comminges is a small town nestled in the French Pyrenees. The kind of place where winters are harsh and unforgiving and where nothing ever happens. Until the winter morning when a group of workers discover the headless, flayed body of a horse, hanging suspended from the edge of a frozen cliff. On the same day the gruesome discovery takes place, Diane Berg, a young psychiatrist starts her first job at a high-security asylum for the criminally insane, just a few miles away. She is baffled by the slightly unorthodox methods the asylum is director uses, and then greatly alarmed when she realizes that drugs are disappearing from within the fortified institution while someone seems to be slipping out at night. Commandant Martin Servaz, a charismatic city cop from nearby Toulouse fond of quoting Latin, can not believe he has been called out over the death of an animal. But there is something disturbing about this crime that he can not ignore. Then DNA from one of the most notorious inmates of the asylum, a highly intelligent former prosecutor, accused of killing and raping several women, is found on the horse carcass... and a few days later the first human murder takes place. A dark story of madness and revenge seems to be unfolding. Servaz and his colleague, the mysterious Irene Ziegler, must use all their skill to solve the terrifying mystery and best one of the most fiendish and clever opponents they could ever imagine.");
        listAllBooks.add(books5);
        Books books6=null;
        books6=new  Books("Harry Potter and the Chamber of Secrets ", "J. K. Rowling", "fantasy",R.drawable.harrypotterandthechamberofsecrets, "The Dursleys were so mean and hideous that summer that all Harry Potter wanted was to get back to the Hogwarts School for Witchcraft and Wizardry. But just as he is packing his bags, Harry receives a warning from a strange, impish creature named Dobby who says that if Harry Potter returns to Hogwarts, disaster will strike. And strike it does. For in Harry is second year at Hogwarts, fresh torments and horrors arise, including an outrageously stuck-up new professor, Gilderoy Lockheart, a spirit named Moaning Myrtle who haunts the girls bathroom, and the unwanted attentions of Ron Weasley is younger sister, Ginny. But each of these seem minor annoyances when the real trouble begins, and someone - or something - starts turning Hogwarts students to stone. Could it be Draco Malfoy, a more poisonous rival than ever? Could it possibly be Hagrid, whose mysterious past is finally told? Or could it be the one everyone at Hogwarts most suspects...Harry Potter himself.");
        listAllBooks.add(books6);
        Books books7=null;
        books7=new  Books("New Moon", "Stephenie Meyer", "fantasy",R.drawable.newmoon,"For Bella Swan, there is one thing more important than life itself: Edward Cullen. But being in love with a vampire is more dangerous than Bella ever could have imagined. Edward has already rescued Bella from the clutches of an evil vampire, but now, as their daring relationship threatens all that is near and dear to them, they realize their troubles may just be beginning...");
        listAllBooks.add(books7);
        Books books8=null;
        books8=new  Books("The Glass Castle ", "Jeannette Walls", "crime",R.drawable.theglasscastle, "Jeannette Walls grew up with parents whose ideals and stubborn nonconformity were both their curse and their salvation. Rex and Rose Mary Walls had four children. In the beginning, they lived like nomads, moving among Southwest desert towns, camping in the mountains. Rex was a charismatic, brilliant man who, when sober, captured his children is imagination, teaching them physics, geology, and above all, how to embrace life fearlessly. Rose Mary, who painted and wrote and could not stand the responsibility of providing for her family, called herself an \"excitement addict.\" Cooking a meal that would be consumed in fifteen minutes had no appeal when she could make a painting that might last forever. Later, when the money ran out, or the romance of the wandering life faded, the Walls retreated to the dismal West Virginia mining town -- and the family -- Rex Walls had done everything he could to escape. He drank. He stole the grocery money and disappeared for days. As the dysfunction of the family escalated, Jeannette and her brother and sisters had to fend for themselves, supporting one another as they weathered their parents' betrayals and, finally, found the resources and will to leave home. What is so astonishing about Jeannette Walls is not just that she had the guts and tenacity and intelligence to get out, but that she describes her parents with such deep affection and generosity. Hers is a story of triumph against all odds, but also a tender, moving tale of unconditional love in a family that despite its profound flaws gave her the fiery determination to carve out a successful life on her own terms. For two decades, Jeannette Walls hid her roots. Now she tells her own story.");
        listAllBooks.add(books8);
        Books books9=null;
        books9=new  Books("Night ", "Elie Wisel", "memoirs",R.drawable.night, "Night is Elie Wiesel’s masterpiece, a candid, horrific, and deeply poignant autobiographical account of his survival as a teenager in the Nazi death camps. This new translation by Marion Wiesel, Elie’s wife and frequent translator, presents this seminal memoir in the language and spirit truest to the author’s original intent. And in a substantive new preface, Elie Wiesel reflects on the enduring importance of Night and his lifelong, passionate dedication to ensuring that the world never forget man’s capacity for inhumanity to man.");
        listAllBooks.add(books9);
        Books books10=null;
        books10=new  Books("Bleeding Heart Square ", "Andrew Taylor", "crime",R.drawable.bleedingheartsquare,"Legend states the Devil once danced in Bleeding Heart Square and left a murdered woman behind him. Formerly the site of a medieval palace, it is now, in 1934, a decaying north London cul-de-sac. In a lodging house resides a collection of tenants with equally colourful histories, including the sinister Samuel Serridge.");
        listAllBooks.add(books10);

        listMyBooks= new ArrayList<>();
        listMyBooks.add(books1);
        listMyBooks.add(books2);

    }


    private void setTabIcons() {
        ImageView imgViewMyBooks= new ImageView(ContentPage.this);
        imgViewMyBooks.setImageResource(R.drawable.profile);
        imgViewMyBooks.setPadding(10,10,10,10);
        mTabLayout.getTabAt(0).setCustomView(imgViewMyBooks);

        ImageView imgViewBooksList= new ImageView(ContentPage.this);
        imgViewBooksList.setImageResource(R.drawable.books);
        imgViewBooksList.setPadding(10,10,10,10);
        mTabLayout.getTabAt(1).setCustomView(imgViewBooksList);
    }

    private void setUpPager() {
        PagerAdapter pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initViews() {
        mViewPager = findViewById(R.id.viewPager);
        mTabLayout = findViewById(R.id.tab);
    }

    @Override
    public void onButtonCLicked(boolean state) {
        onBackPressed();
    }

}