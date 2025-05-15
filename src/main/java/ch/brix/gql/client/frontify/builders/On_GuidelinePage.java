package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePage extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePage() {
    super(new ch.brix.gql.client.On("GuidelinePage"));
  }
  /**
   * **BETA** The `GuidelinePage` id.
   */
  public On_GuidelinePage id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The title of the `GuidelinePage`
   */
  public On_GuidelinePage title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA** The timestamp of the most recent modification to the `GuidelinePage` or its contents. If not modified, this represents the creation time.
   */
  public On_GuidelinePage modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * **BETA** The url of the `GuidelinePage`
   */
  public On_GuidelinePage url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA** A list of `GuidelinePageSection`s that belong to this `GuidelinePage`
   */
  public On_GuidelinePage sections(GuidelinePage_sections callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
