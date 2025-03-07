package ch.brix.gql.client.frontify.builders;

public class CreativeTemplate_variable_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `CreativeTemplateVariable` key.
   * Default value: null
   */
  public CreativeTemplate_variable_Args key(ch.brix.gql.client.frontify.scalars.StringScalar value) {
    _add_arg("key", value);
    return this;
  }
}
