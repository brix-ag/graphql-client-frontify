package ch.brix.gql.client.frontify.builders;

public class RootMutation_createCatalogColumn_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `CreateCatalogColumnInputType` input argument.
   * Default value: null
   */
  public RootMutation_createCatalogColumn_Args input(ch.brix.gql.client.frontify.input_objects.CreateCatalogColumnInput value) {
    _add_arg("input", value);
    return this;
  }
}
