package ch.brix.gql.client.frontify.input_objects;

public class CreateServiceAppInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** The title for the ServiceApp
   */
  public CreateServiceAppInput title(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("title", v);
    return this;
  }
  /**
   * **BETA** The scoped allowed for the ServiceApp
   */
  public CreateServiceAppInput scopes(java.util.List<ch.brix.gql.client.frontify.enums.SecurityScope> v) {
    values.put("scopes", v);
    return this;
  }
  /**
   * **BETA** The description for the ServiceApp
   */
  @ch.brix.gql.client.DefaultValue("null")
  public CreateServiceAppInput description(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("description", v);
    return this;
  }
}
