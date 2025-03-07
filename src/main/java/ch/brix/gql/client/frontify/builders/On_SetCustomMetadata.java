package ch.brix.gql.client.frontify.builders;

public class On_SetCustomMetadata extends ch.brix.gql.client.TypeBuilder {
  public On_SetCustomMetadata() {
    super(new ch.brix.gql.client.On("SetCustomMetadata"));
  }
  /**
   * List of parentIds with newly `CustomMetadata` values set.
   */
  public On_SetCustomMetadata parentIds() {
    _add_field("parentIds");
    return this;
  }
}
