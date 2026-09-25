package ch.brix.gql.client.frontify.builders;

public class On_CatalogSelectionEntry extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogSelectionEntry() {
    super(new ch.brix.gql.client.On("CatalogSelectionEntry"));
  }
  /**
   * **BETA** `CatalogSelectionEntry` id.
   */
  public On_CatalogSelectionEntry id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Opaque id of the link column that led to this entry, `null` for root entries.
   */
  public On_CatalogSelectionEntry sourceColumnId() {
    _add_field("sourceColumnId");
    return this;
  }
  /**
   * **BETA** The selected `CatalogRow`.
   */
  public On_CatalogSelectionEntry row(CatalogSelectionEntry_row callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Linked-row children of this entry.
   */
  public On_CatalogSelectionEntry children(CatalogSelectionEntry_children callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
