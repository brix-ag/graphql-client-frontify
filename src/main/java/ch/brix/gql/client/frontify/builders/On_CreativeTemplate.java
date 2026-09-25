package ch.brix.gql.client.frontify.builders;

public class On_CreativeTemplate extends ch.brix.gql.client.TypeBuilder {
  public On_CreativeTemplate() {
    super(new ch.brix.gql.client.On("CreativeTemplate"));
  }
  /**
   * `CreativeTemplate` id.
   */
  public On_CreativeTemplate id() {
    _add_field("id");
    return this;
  }
  /**
   * **DEPRECATED** Id of the `Brand` of the `CreativeTemplate`. This field will be removed. | Date: 2027-01-01
   * This field will be removed. | Date: 2027-01-01
   */
  @java.lang.Deprecated
  public On_CreativeTemplate brandId() {
    _add_field("brandId");
    return this;
  }
  /**
   * Name of the `CreativeTemplate`.
   */
  public On_CreativeTemplate name() {
    _add_field("name");
    return this;
  }
  /**
   * Description of the `CreativeTemplate`.
   */
  public On_CreativeTemplate description() {
    _add_field("description");
    return this;
  }
  /**
   * **BETA** Mode of the `CreativeTemplate`.
   */
  public On_CreativeTemplate mode() {
    _add_field("mode");
    return this;
  }
  /**
   * Retrieve list of all `CreativeTemplatePage` items belonging to `CreativeTemplate`.
   */
  public On_CreativeTemplate pages(CreativeTemplate_pages callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve list of all `CreativeTemplateExportOption` items belonging to `CreativeTemplate`.
   */
  public On_CreativeTemplate exportOptions(CreativeTemplate_exportOptions callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve a `CreativeTemplateVariable` item by `CreativeTemplateVariable` key.
   */
  public On_CreativeTemplate variable(CreativeTemplate_variable callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Retrieve list of all `CreativeTemplateVariable` items belonging to `CreativeTemplate`.
   */
  public On_CreativeTemplate variables(CreativeTemplate_variables callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Retrieve Asset ID. This field will be removed. | Date: 2027-01-01
   * This field will be removed. | Date: 2027-01-01
   */
  @java.lang.Deprecated
  public On_CreativeTemplate assetId() {
    _add_field("assetId");
    return this;
  }
  /**
   * Tags of the `CreativeTemplate`.
   */
  public On_CreativeTemplate tags(CreativeTemplate_tags callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
