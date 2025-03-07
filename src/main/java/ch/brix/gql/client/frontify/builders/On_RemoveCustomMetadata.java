package ch.brix.gql.client.frontify.builders;

public class On_RemoveCustomMetadata extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveCustomMetadata() {
    super(new ch.brix.gql.client.On("RemoveCustomMetadata"));
  }
  /**
   * List of parentIds with removed `CustomMetadata` values.
   */
  public On_RemoveCustomMetadata parentIds() {
    _add_field("parentIds");
    return this;
  }
}
