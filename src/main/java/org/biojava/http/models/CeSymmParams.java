/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 * Created on Jul 6, 2016
 * Author: blivens 
 *
 */
 
package org.biojava.http.models;

import org.biojava.nbio.structure.symmetry.internal.CeSymmResult;
 
public class CeSymmParams {

	private NGLParams ngl;
	private CeSymmResult result;

	public CeSymmParams(CeSymmResult result) {
		this.result = result;
		this.ngl = new NGLParams("/cesymm/"+result.getStructureId());
	}

	public NGLParams getNgl() {
		return ngl;
	}

	public void setNgl(NGLParams nglParams) {
		this.ngl = nglParams;
	}

	public CeSymmResult getResult() {
		return result;
	}

	public void setResult(CeSymmResult result) {
		this.result = result;
	}
}
