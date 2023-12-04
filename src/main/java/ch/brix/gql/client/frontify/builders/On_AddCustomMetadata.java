package ch.brix.gql.client.frontify.builders;

public class On_AddCustomMetadata extends ch.brix.gql.client.TypeBuilder {
  public On_AddCustomMetadata() {
    super(new ch.brix.gql.client.On("AddCustomMetadata"));
  }
  /**
   * List of the parent Ids where the new `CustomMetadata` values were added.
   */
  public On_AddCustomMetadata parentIds() {
    _add_field("parentIds");
    return this;
  }
}
