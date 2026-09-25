package ch.brix.gql.client.frontify.builders;

public class CatalogRow_cells_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** Column IDs to fetch cells for.
   * Default value: null
   */
  public CatalogRow_cells_Args columnIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> value) {
    _add_arg("columnIds", value);
    return this;
  }
}
