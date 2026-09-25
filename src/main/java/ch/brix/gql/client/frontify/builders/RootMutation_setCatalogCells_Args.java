package ch.brix.gql.client.frontify.builders;

public class RootMutation_setCatalogCells_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `SetCatalogCellsInputType` input argument.
   * Default value: null
   */
  public RootMutation_setCatalogCells_Args input(ch.brix.gql.client.frontify.input_objects.SetCatalogCellsInput value) {
    _add_arg("input", value);
    return this;
  }
}
