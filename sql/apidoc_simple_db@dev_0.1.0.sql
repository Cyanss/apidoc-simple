-- ----------
-- company 公司
-- ----------
DROP TABLE IF EXISTS "public"."company";
CREATE TABLE "public"."company" (
  "id" VARCHAR(64) COLLATE "default" NOT NULL,
  "code" VARCHAR(128) COLLATE "default",
  "name" VARCHAR(256) COLLATE "default",
  "description" VARCHAR(1024) COLLATE "default",
  "telephone" VARCHAR(64) COLLATE "default",
  "email" VARCHAR(64) COLLATE "default",
  "address" VARCHAR(1024) COLLATE "default",
  "regdate" TIMESTAMPTZ,
  "properties" JSONB,
  "logic_sign" INT4,
  "create_time" TIMESTAMPTZ,
  "update_time" TIMESTAMPTZ
);
COMMENT ON COLUMN "public"."company"."code" IS '公司编码';
COMMENT ON COLUMN "public"."company"."name" IS '公司名称';
COMMENT ON COLUMN "public"."company"."description" IS '公司描述';
COMMENT ON COLUMN "public"."company"."telephone" IS '公司电话';
COMMENT ON COLUMN "public"."company"."email" IS '公司邮箱';
COMMENT ON COLUMN "public"."company"."address" IS '公司详细地址';
COMMENT ON COLUMN "public"."company"."regdate" IS '公司注册日期';
COMMENT ON COLUMN "public"."company"."properties" IS '其他属性';
COMMENT ON COLUMN "public"."company"."logic_sign" IS '逻辑删除标记';
COMMENT ON COLUMN "public"."company"."create_time" IS '创建时间';
COMMENT ON COLUMN "public"."company"."update_time" IS '更新时间';

-- PK 主键

ALTER TABLE "public"."company" ADD CONSTRAINT "PK_COMPANY_ID" PRIMARY KEY ("id");

-- INDEX 索引

CREATE INDEX "IDX_COMPANY_CODE" ON "public"."company" USING btree (
  "code" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);

CREATE INDEX "IDX_COMPANY_NAME" ON "public"."company" USING btree (
  "name" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);

CREATE INDEX "IDX_COMPANY_REGDATE" ON "public"."company" USING btree (
  "regdate" "pg_catalog"."timestamptz_ops" ASC NULLS LAST
);

CREATE INDEX IF NOT EXISTS "IDX_COMPANY_LOGIC_SIGN" ON "public"."company" USING btree (
  "logic_sign" "pg_catalog"."int4_ops" ASC NULLS LAST
);
