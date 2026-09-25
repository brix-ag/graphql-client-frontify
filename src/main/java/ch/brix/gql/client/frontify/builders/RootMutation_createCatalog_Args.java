package ch.brix.gql.client.frontify.builders;

public class RootMutation_createCatalog_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `CreateCatalogInputType` input argument.
   * Default value: null
   */
  public RootMutation_createCatalog_Args input(ch.brix.gql.client.frontify.input_objects.CreateCatalogInput value) {
    _add_arg("input", value);
    return this;
  }
}
