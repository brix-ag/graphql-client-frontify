package ch.brix.gql.client.frontify.input_objects;

public class CreateCopyrightInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` copyright status.
   */
  @ch.brix.gql.client.DefaultValue("UNKNOWN")
  public CreateCopyrightInput status(ch.brix.gql.client.frontify.enums.CopyrightStatus v) {
    values.put("status", v);
    return this;
  }
  /**
   * `Asset` copyright notice. Supports medium text length.
   */
  @ch.brix.gql.client.DefaultValue("\"\"")
  public CreateCopyrightInput notice(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("notice", v);
    return this;
  }
}
