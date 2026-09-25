package ch.brix.gql.client.frontify.builders;

public class On_HideGuidelineDocumentGroupFromNavigation extends ch.brix.gql.client.TypeBuilder {
  public On_HideGuidelineDocumentGroupFromNavigation() {
    super(new ch.brix.gql.client.On("HideGuidelineDocumentGroupFromNavigation"));
  }
  /**
   * **BETA** The ID of the guideline document group hidden from the navigation.
   */
  public On_HideGuidelineDocumentGroupFromNavigation id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Whether or not the guideline document group is hidden in navigation.
   */
  public On_HideGuidelineDocumentGroupFromNavigation isHiddenInNavigation() {
    _add_field("isHiddenInNavigation");
    return this;
  }
}
