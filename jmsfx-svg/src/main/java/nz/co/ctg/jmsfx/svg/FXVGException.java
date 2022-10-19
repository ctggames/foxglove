/*
 * Copyright (c) 2010 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */

package nz.co.ctg.jmsfx.svg;

public final class FXVGException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public final FXVGExceptionCode code;

    public FXVGException(FXVGExceptionCode code, String message) {
        super(message);
        this.code = code;
    }

    public FXVGExceptionCode getCode() {
        return code;
    }

}
