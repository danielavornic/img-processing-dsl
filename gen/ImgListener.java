// Generated from D:/UTM/4_th_semester/DSL/img-processing-dsl/Img.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImgParser}.
 */
public interface ImgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImgParser#startCommand}.
	 * @param ctx the parse tree
	 */
	void enterStartCommand(ImgParser.StartCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#startCommand}.
	 * @param ctx the parse tree
	 */
	void exitStartCommand(ImgParser.StartCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ImgParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ImgParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#commandSequence}.
	 * @param ctx the parse tree
	 */
	void enterCommandSequence(ImgParser.CommandSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#commandSequence}.
	 * @param ctx the parse tree
	 */
	void exitCommandSequence(ImgParser.CommandSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#image_param}.
	 * @param ctx the parse tree
	 */
	void enterImage_param(ImgParser.Image_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#image_param}.
	 * @param ctx the parse tree
	 */
	void exitImage_param(ImgParser.Image_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ImgParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ImgParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#crop}.
	 * @param ctx the parse tree
	 */
	void enterCrop(ImgParser.CropContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#crop}.
	 * @param ctx the parse tree
	 */
	void exitCrop(ImgParser.CropContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#convert}.
	 * @param ctx the parse tree
	 */
	void enterConvert(ImgParser.ConvertContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#convert}.
	 * @param ctx the parse tree
	 */
	void exitConvert(ImgParser.ConvertContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#rotate}.
	 * @param ctx the parse tree
	 */
	void enterRotate(ImgParser.RotateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#rotate}.
	 * @param ctx the parse tree
	 */
	void exitRotate(ImgParser.RotateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#flipX}.
	 * @param ctx the parse tree
	 */
	void enterFlipX(ImgParser.FlipXContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#flipX}.
	 * @param ctx the parse tree
	 */
	void exitFlipX(ImgParser.FlipXContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#flipY}.
	 * @param ctx the parse tree
	 */
	void enterFlipY(ImgParser.FlipYContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#flipY}.
	 * @param ctx the parse tree
	 */
	void exitFlipY(ImgParser.FlipYContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#bw}.
	 * @param ctx the parse tree
	 */
	void enterBw(ImgParser.BwContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#bw}.
	 * @param ctx the parse tree
	 */
	void exitBw(ImgParser.BwContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#resize}.
	 * @param ctx the parse tree
	 */
	void enterResize(ImgParser.ResizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#resize}.
	 * @param ctx the parse tree
	 */
	void exitResize(ImgParser.ResizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#contrast}.
	 * @param ctx the parse tree
	 */
	void enterContrast(ImgParser.ContrastContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#contrast}.
	 * @param ctx the parse tree
	 */
	void exitContrast(ImgParser.ContrastContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#brightness}.
	 * @param ctx the parse tree
	 */
	void enterBrightness(ImgParser.BrightnessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#brightness}.
	 * @param ctx the parse tree
	 */
	void exitBrightness(ImgParser.BrightnessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#negative}.
	 * @param ctx the parse tree
	 */
	void enterNegative(ImgParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#negative}.
	 * @param ctx the parse tree
	 */
	void exitNegative(ImgParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#colorize}.
	 * @param ctx the parse tree
	 */
	void enterColorize(ImgParser.ColorizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#colorize}.
	 * @param ctx the parse tree
	 */
	void exitColorize(ImgParser.ColorizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#blur}.
	 * @param ctx the parse tree
	 */
	void enterBlur(ImgParser.BlurContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#blur}.
	 * @param ctx the parse tree
	 */
	void exitBlur(ImgParser.BlurContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#sharpen}.
	 * @param ctx the parse tree
	 */
	void enterSharpen(ImgParser.SharpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#sharpen}.
	 * @param ctx the parse tree
	 */
	void exitSharpen(ImgParser.SharpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#compress}.
	 * @param ctx the parse tree
	 */
	void enterCompress(ImgParser.CompressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#compress}.
	 * @param ctx the parse tree
	 */
	void exitCompress(ImgParser.CompressContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#ft}.
	 * @param ctx the parse tree
	 */
	void enterFt(ImgParser.FtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#ft}.
	 * @param ctx the parse tree
	 */
	void exitFt(ImgParser.FtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#threshold}.
	 * @param ctx the parse tree
	 */
	void enterThreshold(ImgParser.ThresholdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#threshold}.
	 * @param ctx the parse tree
	 */
	void exitThreshold(ImgParser.ThresholdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#imageArg}.
	 * @param ctx the parse tree
	 */
	void enterImageArg(ImgParser.ImageArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#imageArg}.
	 * @param ctx the parse tree
	 */
	void exitImageArg(ImgParser.ImageArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#filePath}.
	 * @param ctx the parse tree
	 */
	void enterFilePath(ImgParser.FilePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#filePath}.
	 * @param ctx the parse tree
	 */
	void exitFilePath(ImgParser.FilePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImgParser#folderPath}.
	 * @param ctx the parse tree
	 */
	void enterFolderPath(ImgParser.FolderPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImgParser#folderPath}.
	 * @param ctx the parse tree
	 */
	void exitFolderPath(ImgParser.FolderPathContext ctx);
}