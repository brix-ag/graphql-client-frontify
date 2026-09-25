package ch.brix.gql.client.frontify.builders;

public class On_HideGuidelineDocumentPageFromNavigation extends ch.brix.gql.client.TypeBuilder {
  public On_HideGuidelineDocumentPageFromNavigation() {
    super(new ch.brix.gql.client.On("HideGuidelineDocumentPageFromNavigation"));
  }
  /**
   * **BETA** The ID of the guideline document page hidden from the navigation.
   */
  public On_HideGuidelineDocumentPageFromNavigation id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whether or not the guideline document group is hidden in navigation.
   */
  public On_HideGuidelineDocumentPageFromNavigation isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
}
