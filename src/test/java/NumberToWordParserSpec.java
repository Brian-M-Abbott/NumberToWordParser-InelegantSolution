import io.brianabbott.com.NumberToWordParser;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by brianabbott on 6/9/16.
 */
public class NumberToWordParserSpec {


    @Test
    public void singleDigitEntryTest(){
        String expectedWords = "ThreeDollars";
        String actualWords = NumberToWordParser.numberToWordConverter("3");
        assertEquals("The converted value should be ThreeDollars",expectedWords,actualWords);
    }

    @Test
    public void DoubleDigitEntryTest(){
        String expectedWords = "FifteenDollars";
        String actualWords = NumberToWordParser.numberToWordConverter("15");
        assertEquals("The converted value should be FifteenDollars",expectedWords,actualWords);
    }

    @Test
    public void TripleDigitEntryTest(){
        String expectedWords = "TwoHundredTwentyTwoDollars";
        String actualWords = NumberToWordParser.numberToWordConverter("222");
        assertEquals("The converted value should be TwoHundredTwentyTwoDollars",expectedWords,actualWords);
    }

    @Test
    public void QuadrupleDigitEntryTest(){
        String expectedWords = "TwoThousandTwoHundredDollars";
        String actualWords = NumberToWordParser.numberToWordConverter("2200");
        assertEquals("The converted value should be TwoThousandTwoHundredDollars",expectedWords,actualWords);
    }

    @Test
    public void FiveDigitEntryTest(){
        String expectedWords = "TwentyFourThousandFiveHundredTwelveDollars";
        String actualWords = NumberToWordParser.numberToWordConverter("24512");
        assertEquals("The converted value should be TwentyFourThousandFiveHundredTwelveDollars",expectedWords,actualWords);
    }

    @Test
    public void SixDigitEntryTest(){
        String expectedWords = "NineHundredEightySevenThousandFiveHundredTwentyOneDollars";
        String actualWords = NumberToWordParser.numberToWordConverter("987521");
        assertEquals("The converted value should be OneHundredTwentyFourThousandFiveHundredTwelveDollars",expectedWords,actualWords);
    }

    @Test
    public void SevenDigitEntryTest(){
        String expectedWords = "OneMillionTwentyFourThousandFiveHundredTwelveDollars";
        String actualWords = NumberToWordParser.numberToWordConverter("1024512");
        assertEquals("The converted value should be OneMillionTwentyFourThousandFiveHundredTwelveDollars",expectedWords,actualWords);
    }

    @Test
    public void EightDigitEntryTest(){
        String expectedWords = "TenMillionTwentyFourThousandFiveHundredTwelveDollars";
        String actualWords = NumberToWordParser.numberToWordConverter("10024512");
        assertEquals("The converted value should be TenMillionTwentyFourThousandFiveHundredTwelveDollars",expectedWords,actualWords);
    }

    @Test
    public void NineDigitEntryTest(){
        String expectedWords = "OneHundredFifteenMillionTwentyFourThousandFiveHundredTwelveDollars";
        String actualWords = NumberToWordParser.numberToWordConverter("115024512");
        assertEquals("The converted value should be OneHundredFifteenMillionTwentyFourThousandFiveHundredTwelveDollars",expectedWords,actualWords);
    }
}
