package com.sherazkhilji.videffect;

import com.sherazkhilji.videffect.interfaces.ShaderInterface;

/**
 * Displays the normal video without any effect.
 * 
 * @author sheraz.khilji
 *
 */
public class NoEffect implements ShaderInterface {
	/**
	 * Initialize
	 * 
	 */
	public NoEffect() {
	}

	@Override
	public String getShader() {

		String shader = "#extension GL_OES_EGL_image_external : require\n"
				+ "precision mediump float;\n"
				+ "varying vec2 vTextureCoord;\n"
				+ "uniform samplerExternalOES sTexture;\n" + "void main() {\n"
				+ "  gl_FragColor = texture2D(sTexture, vTextureCoord);\n"
				+ "}\n";

		return shader;

	}
}