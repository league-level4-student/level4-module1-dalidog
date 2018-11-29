package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	Zodiac zodiac = Zodiac.AQUARIUS;
	public static void main(String[] args) {
		
	}
	void test(){
switch(zodiac) {
case AQUARIUS:
	JOptionPane.showMessageDialog(null,"Take a breath! In your zeal to transform an area of your life have your tactics become a bit “extreme?” Today’s quarter moon in Virgo helps you tone it down so that you can actually reach your lofty goal. Rome wasn’t built, decorated or renovated in a day, Aquarius; in fact, slow and steady growth is usually the kind that lasts. Revise your game plan so that you don’t burn out before you even see the first signs of progress. If it takes a little longer to reach the finish line, so be it. At least you know that you’ll make it there!");
	break;
case TAURUS:
	JOptionPane.showMessageDialog(null, "Today’s sweet-talking quarter moon could find you in a downright sappy state. Don’t fight the feelings—or censor the (slightly sloppy) sentiment. This revelatory energy might make you feel vulnerable, but relationships can’t advance to the next level if you never show your hand. Then there’s the other side of the equation: Have you been working a little too hard in a romantic relationship? Switch it up! Instead of hotly pursuing, draw back and let them come to you. A little cat and mouse game can keep the magic alive.");
	break;
case GEMINI:
	JOptionPane.showMessageDialog(null,"Today’s quarter moon in your domestic fourth house helps you find the balance between nomad and nester. You love your on-the-go lifestyle, but between parties and world tours you also need a cozy place to hang your chapeau. Spend some time feathering (or feng shui-ing) Chateau Gemini. Make sure your space feels more like a sanctuary than a stopover between your various expeditions. If a relative or close friend has been hogging up your free time this is the day where you hang the Do Not Disturb sign and let ‘em know where the limits of your generosity lie. Some “me time” is a must to restore your sanity.");
	break;
case CANCER:
	JOptionPane.showMessageDialog(null,"Obsess over the details, Cancer, as it's the little things that make the difference right now. Before you send off a proposal or even a questionable text, run it through the quality control filter. Get an extra pair of eyes to give it a scan while you're at it. Raise the bar when it comes to joint projects, too. Today, you want to set an impeccable standard; and turn in work that you'd be proud of.");
	break;
case LEO:
	JOptionPane.showMessageDialog(null,"Today's moon in Leo encourages you to be more of a leader in your relationships. Show more obvious interest towards your crush du jour—and in the process, learn who the person REALLY is instead of projecting a fantasy onto them. Attached? Instead of complaining about your sweetie's shortcomings, plan a dinner date and talk about it in a relaxed atmosphere.");
	break;
case ARIES:
	JOptionPane.showMessageDialog(null,"Today’s quarter moon in efficient Virgo calls for some checks and balances. You’ve been steadily expanding, Aries, and this is a good thing—but have you rushed and gotten ahead of yourself? Balance your idealistic view with some practical measures. You might need to reel in your ambitions a tad so that you can actually get an idea off the ground. Bring it back to basics and map out a realistic plan. Remember: the journey of a thousand miles begins with a single step.");
	break;
case VIRGO:
	JOptionPane.showMessageDialog(null,"Out with the old…and let's just leave it there, Virgo. Today is about clearing space and leaving it empty for a while. Your eyes need a place to rest, so your mind can do the same. Pack away some of the tchotchkes and group your artwork into collections, leaving only a few stunners on display. Give your schedule the same treatment. ");
	break;
case LIBRA:
	JOptionPane.showMessageDialog(null,"Don’t throw out the baby with the bathwater. Today’s quarter moon in your twelfth house of transitions calls for some cuts but NOT a complete overhaul. While it’s true that an aspect of your aspirations may be a little too lofty to achieve before 2018 is through, there is plenty you CAN do now. Scale back; pare down—moderately, that is. Your revamped plan will have plenty of life in it, even if it has a few less bells and whistles. On the personal front, make a point of being more compassionate and less critical. People need understanding, not advice.");
	break;
case SCORPIO:
	JOptionPane.showMessageDialog(null,"You're not down for a game of Follow the Leader today, Scorpio. Instead, you want to be the one who everyone is trailing after. Don't forget that the mark of a front runner is the willingness to step out solo and be the first to take a risk. Don't stress if there's no one in your rearview mirror right away. Trust your instincts and make your big leap. ");
	break;
case SAGITTARIUS:
	JOptionPane.showMessageDialog(null,"Strengthen that backbone, Archer. Today’s quarter moon in your house of ambition blesses you with swagger and confidence. There’s no time to poll the masses for agreement or consensus. Take the wheel like a boss and make the final call. Although you might catch some flak for your decision, it’s better than leaving things up to chance. Do your professional aspirations need a little fine-tuning? Devote part of the day to job-related activities, whether you’re polishing up your resume, shopping for a new interview outfit, or tying up the loose ends you left dangling last week.");
	break;
case CAPRICORN:
	JOptionPane.showMessageDialog(null,"Today, temper your truth with tact. With a quarter moon in your candid ninth house, you simply can’t lie about your stance. Yet as you swig from that cup of courage remember that words are hard to take back once they’ve been blurted out, Tweeted or typed into an email. Put yourself in the other person’s shoes and be diplomatic. And if that’s simply not possible, write out a draft that you never send. It might be helpful to just write out the raw emotions before you try to edit down to a tamer version of your thoughts. Then drop that paper into the fireplace instead of the mailbox.");
	break;
case PISCES:
	JOptionPane.showMessageDialog(null,"Today’s quarter moon in Virgo reminds you to appreciate the subtler, more enduring qualities that people have to offer. You may have overlooked that strong, silent supporter who has been standing quietly in your corner all along. Remember that some people show their love by being helpful and consistent rather than showering you with gifts. In the final analysis, a steady supporter is probably worth more than the dashing romantic who is here today, gone tomorrow.");
	break;
	}}
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	
}

