package ch.brix.gql.client.frontify.builders;

public class On_ShowGuidelineDocumentPageInNavigation extends ch.brix.gql.client.TypeBuilder {
  public On_ShowGuidelineDocumentPageInNavigation() {
    super(new ch.brix.gql.client.On("ShowGuidelineDocumentPageInNavigation"));
  }
  /**
   * **BETA** The ID of the guideline document page shown in the navigation.
   */
  public On_ShowGuidelineDocumentPageInNavigation id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whether or not the guideline document page is hidden in navigation.
   */
  public On_ShowGuidelineDocumentPageInNavigation isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
}
