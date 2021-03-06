/**
 * *****************************************************************************
 *
 * <p>Copyright FUJITSU LIMITED 2019
 *
 * <p>Creation Date: July 19, 2019
 *
 * <p>*****************************************************************************
 */
package org.oscm.identity.model.json;

import lombok.Builder;
import lombok.Getter;
import org.oscm.identity.commons.TokenType;

import javax.validation.constraints.NotNull;

/** Token validation request wrapper */
@Getter
@Builder(builderMethodName = "of")
public class TokenDetailsDTO {

  @NotNull private String token;
  @NotNull private TokenType tokenType;
}
