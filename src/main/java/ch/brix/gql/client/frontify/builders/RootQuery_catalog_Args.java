package ch.brix.gql.client.frontify.builders;

public class RootQuery_catalog_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `Catalog` id.
   * Default value: null
   */
  public RootQuery_catalog_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
}
