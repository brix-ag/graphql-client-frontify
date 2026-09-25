package ch.brix.gql.client.frontify.builders;

public class On_DeleteGuidelineDocumentLink extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteGuidelineDocumentLink() {
    super(new ch.brix.gql.client.On("DeleteGuidelineDocumentLink"));
  }
  /**
   * **BETA** The ID of the deleted document link.
   */
  public On_DeleteGuidelineDocumentLink id() {
    _add_field("id");
    return this;
  }
}
