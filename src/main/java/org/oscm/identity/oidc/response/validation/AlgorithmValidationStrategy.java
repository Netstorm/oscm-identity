/**
 * *****************************************************************************
 *
 * <p>Copyright FUJITSU LIMITED 2019
 *
 * <p>Creation Date: July 17, 2019
 *
 * <p>*****************************************************************************
 */
package org.oscm.identity.oidc.response.validation;

import org.oscm.identity.oidc.request.TokenValidationRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.bind.ValidationException;

@Component
public class AlgorithmValidationStrategy implements TokenValidationStrategy {

  private static final String VALIDATION_FAILURE_MESSAGE =
      "Signing algorithm type does not match the expected one";

  @Value("${auth.signing.algorithm.type}")
  private String expectedAlgorithmType;

  @Override
  public void execute(TokenValidationRequest request) throws ValidationException {
    if (!request.getDecodedToken().getAlgorithm().equalsIgnoreCase(expectedAlgorithmType))
      throw new ValidationException(VALIDATION_FAILURE_MESSAGE);
  }
}
