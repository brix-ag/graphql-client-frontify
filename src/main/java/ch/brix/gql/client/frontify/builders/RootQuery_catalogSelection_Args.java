package ch.brix.gql.client.frontify.builders;

public class RootQuery_catalogSelection_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `CatalogSelection` id.
   * Default value: null
   */
  public RootQuery_catalogSelection_Args id(ch.brix.gql.client.frontify.scalars.IdScalar value) {
    _add_arg("id", value);
    return this;
  }
}
