package ch.brix.gql.client.frontify.builders;

public class On_ShowGuidelineDocumentInNavigation extends ch.brix.gql.client.TypeBuilder {
  public On_ShowGuidelineDocumentInNavigation() {
    super(new ch.brix.gql.client.On("ShowGuidelineDocumentInNavigation"));
  }
  /**
   * **BETA** The ID of the guideline document shown in the navigation.
   */
  public On_ShowGuidelineDocumentInNavigation id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whether or not the guideline document is hidden in navigation.
   */
  public On_ShowGuidelineDocumentInNavigation isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
}
