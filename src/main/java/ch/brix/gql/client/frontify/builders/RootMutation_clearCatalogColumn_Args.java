package ch.brix.gql.client.frontify.builders;

public class RootMutation_clearCatalogColumn_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `ClearCatalogColumnInputType` input argument.
   * Default value: null
   */
  public RootMutation_clearCatalogColumn_Args input(ch.brix.gql.client.frontify.input_objects.ClearCatalogColumnInput value) {
    _add_arg("input", value);
    return this;
  }
}
