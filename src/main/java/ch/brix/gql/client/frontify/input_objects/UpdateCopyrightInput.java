package ch.brix.gql.client.frontify.input_objects;

public class UpdateCopyrightInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` copyright status.
   */
  public UpdateCopyrightInput status(ch.brix.gql.client.frontify.enums.CopyrightStatus v) {
    values.put("status", v);
    return this;
  }
  /**
   * `Asset` copyright notice.
   */
  public UpdateCopyrightInput notice(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("notice", v);
    return this;
  }
}
