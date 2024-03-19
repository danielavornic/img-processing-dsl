// Generated from D:/UTM/4_th_semester/DSL/img-processing-dsl/Img.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImgParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImgVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImgParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ImgParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#commandSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandSequence(ImgParser.CommandSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ImgParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#crop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrop(ImgParser.CropContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#convert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvert(ImgParser.ConvertContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#rotate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotate(ImgParser.RotateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#flipX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlipX(ImgParser.FlipXContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#flipY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlipY(ImgParser.FlipYContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#bw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBw(ImgParser.BwContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#resize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResize(ImgParser.ResizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#contrast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContrast(ImgParser.ContrastContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#brightness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrightness(ImgParser.BrightnessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(ImgParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#colorize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorize(ImgParser.ColorizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#blur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlur(ImgParser.BlurContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#sharpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharpen(ImgParser.SharpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#compress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompress(ImgParser.CompressContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#ft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFt(ImgParser.FtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#threshold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreshold(ImgParser.ThresholdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#imageArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageArg(ImgParser.ImageArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#filePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilePath(ImgParser.FilePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImgParser#folderPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolderPath(ImgParser.FolderPathContext ctx);
}