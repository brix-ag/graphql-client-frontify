package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreativeTemplate {
  /**
   * `CreativeTemplate` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **DEPRECATED** Id of the `Brand` of the `CreativeTemplate`. This field will be removed. | Date: 2027-01-01
   * This field will be removed. | Date: 2027-01-01
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("brandId")
  private ch.brix.gql.client.frontify.scalars.IdScalar brandId;
  /**
   * Name of the `CreativeTemplate`.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * Description of the `CreativeTemplate`.
   */
  @com.google.gson.annotations.SerializedName("description")
  private ch.brix.gql.client.frontify.scalars.StringScalar description;
  /**
   * Retrieve list of all `CreativeTemplatePage` items belonging to `CreativeTemplate`.
   */
  @com.google.gson.annotations.SerializedName("pages")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CreativeTemplatePage.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CreativeTemplatePage> pages;
  /**
   * Retrieve list of all `CreativeTemplateExportOption` items belonging to `CreativeTemplate`.
   */
  @com.google.gson.annotations.SerializedName("exportOptions")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CreativeTemplateExportOption.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CreativeTemplateExportOption> exportOptions;
  /**
   * Retrieve a `CreativeTemplateVariable` item by `CreativeTemplateVariable` key.
   */
  @com.google.gson.annotations.SerializedName("variable")
  private ch.brix.gql.client.frontify.objects.CreativeTemplateVariable variable;
  /**
   * Retrieve list of all `CreativeTemplateVariable` items belonging to `CreativeTemplate`.
   */
  @com.google.gson.annotations.SerializedName("variables")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CreativeTemplateVariable.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CreativeTemplateVariable> variables;
  /**
   * **DEPRECATED** Retrieve Asset ID. This field will be removed. | Date: 2027-01-01
   * This field will be removed. | Date: 2027-01-01
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("assetId")
  private ch.brix.gql.client.frontify.scalars.IdScalar assetId;
  /**
   * Tags of the `CreativeTemplate`.
   */
  @com.google.gson.annotations.SerializedName("tags")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.Tag.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.Tag> tags;
}
