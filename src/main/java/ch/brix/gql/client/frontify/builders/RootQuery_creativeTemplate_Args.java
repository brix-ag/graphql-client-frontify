package ch.brix.gql.client.frontify.builders;

public class RootQuery_creativeTemplate_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `CreativeTemplate` Id.
   * Default value: null
   */
  public RootQuery_creativeTemplate_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
}
