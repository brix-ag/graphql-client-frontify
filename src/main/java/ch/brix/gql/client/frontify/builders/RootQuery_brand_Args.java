package ch.brix.gql.client.frontify.builders;

public class RootQuery_brand_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Brand` Id.
   * Default value: null
   */
  public RootQuery_brand_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
}
