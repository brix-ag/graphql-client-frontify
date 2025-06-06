package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreativeTemplate {
  /**
   * `CreativeTemplate` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * Id of the `Brand` of the `CreativeTemplate`.
   */
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
   * Retrieve Asset ID.
   */
  @com.google.gson.annotations.SerializedName("assetId")
  private ch.brix.gql.client.frontify.scalars.IdScalar assetId;
  /**
   * Tags of the `CreativeTemplate`.
   */
  @com.google.gson.annotations.SerializedName("tags")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.Tag.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.Tag> tags;
}
